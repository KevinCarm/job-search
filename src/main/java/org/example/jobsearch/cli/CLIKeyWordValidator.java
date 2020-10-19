package org.example.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIKeyWordValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        if(!value.matches("^[A-Za-z]+[0-9]*$")){
            System.err.println("El criterio de búsqueda no es válido");
            throw new ParameterException("Solo letras y números");
        }
    }
}