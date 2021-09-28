package com.tptj.demo.hg.locale;

import com.fr.intelli.record.Focus;
import com.fr.record.analyzer.EnableMetrics;
import com.fr.stable.fun.impl.AbstractLocaleFinder;

@EnableMetrics
public class Demo extends AbstractLocaleFinder {
    @Override
    @Focus(id="com.tptj.demo.hg.locale.v10", text="国际化demo")
    public String find() {      
        return "com/tptj/demo/hg/locale/demo";
    }
}
