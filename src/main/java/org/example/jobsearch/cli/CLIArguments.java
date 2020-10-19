package org.example.jobsearch.cli;

import com.beust.jcommander.Parameter;

public class CLIArguments {
    @Parameter(
            required = true,
            descriptionKey = "Palabra clave",
            validateWith = CLIKeyWordValidator.class,
            description = "Palabra clave"
    )
    private String keyword;
    @Parameter(
            names = {"--location", "-l"},
            description = "La búsqueda puede incluir un lugar en específico"
    )
    private String location;
    @Parameter(
            names = {"--page", "-p"},
            description = "La paginación devuelve 50 elementos"
    )
    private int page;
    @Parameter(
            names = {"--fulltime", "-ft"},
            description = "Se especifica si la búsquda es de tiempo completo"
    )
    private boolean isFullTime = false;

    @Parameter(
            names = {"--markdown", "-md"},
            description = "Se especifica si las búsqueda se devuelve en formato MarkDown"
    )
    private boolean isMarkDown = false;

    @Parameter(
            names = {"--help", "-h"},
            validateWith = CLIHelpValidator.class,
            description = "Se devuelve la ayuda"
    )
    private boolean isHelp;

    private CLIArguments(){ }

    public static CLIArguments newInstance(){
        return new CLIArguments();
    }

    @Override
    public String toString() {
        return "CLIArguments{" +
                "keyword='" + keyword + '\'' +
                ", location='" + location + '\'' +
                ", page=" + page +
                ", isFullTime=" + isFullTime +
                ", isMarkDown=" + isMarkDown +
                ", isHelp=" + isHelp +
                '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public String getLocation() {
        return location;
    }

    public int getPage() {
        return page;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public boolean isMarkDown() {
        return isMarkDown;
    }

    public boolean isHelp() {
        return isHelp;
    }
}
