package com.tptj.demo.hg.locale;

import com.fr.design.i18n.Toolkit;
import com.fr.locale.InterProviderFactory;
import com.fr.script.AbstractFunction;
import com.fr.stable.exception.FormulaException;

import java.util.Arrays;
public class LocaleTest extends AbstractFunction {
    @Override
    public Object run(Object[] objects) throws FormulaException {
        String key = (String)objects[0] ;
        if(1 < objects.length){
            String[] vals = Arrays.copyOfRange(objects,1,objects.length,String[].class);
            //Toolkit.i18nText("");
            return InterProviderFactory.getProvider().getLocText(key,vals);
        }else{
            return InterProviderFactory.getProvider().getLocText(key);
        }
    }
}
