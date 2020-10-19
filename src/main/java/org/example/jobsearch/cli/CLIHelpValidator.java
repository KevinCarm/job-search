package org.example.jobsearch.cli;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class CLIHelpValidator implements IParameterValidator {
    @Override
    public void validate(String name, String value) throws ParameterException {
        boolean valorActual = Boolean.parseBoolean(value);
        if(valorActual){
            throw new ParameterException("No cuenta con soporte actualmente");
        }
    }
}
