/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.eks;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EKSComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "configuration": ((EKSComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.eks.EKSConfiguration.class, value)); return true;
        case "accessKey": ((EKSComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((EKSComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((EKSComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((EKSComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((EKSComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((EKSComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.eks.EKSConfiguration.class, value)); return true;
        case "accesskey": ((EKSComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((EKSComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((EKSComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((EKSComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((EKSComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}
