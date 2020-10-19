package org.example.jobsearch;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;

import org.example.jobsearch.api.APIFunctions;
import org.example.jobsearch.api.APIJobs;
import org.example.jobsearch.cli.CLIArguments;
import org.example.jobsearch.cli.CLIFunctions;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class JobSearch {
    public static void main(String[] args) {
        System.out.println("Hola Mundo!");
        JCommander jCommander = CommanderFunctions.buildCommanderWithName
                ("job-search", CLIArguments::newInstance);

        Stream<CLIArguments> streamOfCli = parseArguments(jCommander, args, JCommander::usage)
                .orElse(Collections.emptyList()).stream().map(obj -> (CLIArguments) obj);

        Optional<CLIArguments> cliArgumentsOptional = streamOfCli.filter(cli -> !cli.isHelp()).
                filter(cli -> cli.getKeyword() != null).findFirst();

        cliArgumentsOptional.map(CLIFunctions::toMap).map(JobSearch::executeRequest).
                orElse(Stream.empty()).forEach(System.out::println);
    }

    static Optional<List<Object>> parseArguments(JCommander jCommander, String[] arguments,
                                                 Consumer<JCommander> onError) {
        try {
            jCommander.parse(arguments);
            return Optional.of(jCommander.getObjects());
        } catch (ParameterException paramEx) {
            onError.accept(jCommander);
        }
        return Optional.empty();
    }

    

    private static Stream<JobPosition> executeRequest(Map<String, Object> params) {
        APIJobs apiJobs = APIFunctions.buildAPI(APIJobs.class, "https://jobs.github.com/");
        return Stream.of(params).map(apiJobs::jobs).flatMap(Collection::stream);
    }

}
