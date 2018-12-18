package org.stategen.framework.progen.wrap;

import org.stategen.framework.util.StringUtil;

public class OptionConfigWrap {
    private String bean;
    private String none ;
    private String changeBy ;

    public String getNone() {
        return none;
    }

    public String getBean() {
        return bean;
    }
    
    public void setBean(String bean) {
        this.bean = bean;
    }

    public void setNone(String none) {
        if (StringUtil.isEmpty(none)){
            return;
        }
        this.none = none;
    }


    public String getChangeBy() {

        return changeBy;
    }
    
    public void setChangeBy(String changeBy) {
        if (StringUtil.isEmpty(changeBy)){
            return;
        }
        this.changeBy = changeBy;
    }
    
}
