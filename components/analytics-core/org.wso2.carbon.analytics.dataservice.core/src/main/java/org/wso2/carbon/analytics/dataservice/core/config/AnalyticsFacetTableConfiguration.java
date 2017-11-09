package org.wso2.carbon.analytics.dataservice.core.config;

import org.wso2.carbon.analytics.dataservice.core.indexing.AnalyticsDataIndexer;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class represents the table level information for facets in indexing
 */
@XmlRootElement(name = "table")
public class AnalyticsFacetTableConfiguration {

    private String name;
    private String facetSplitter;
    private String facetDefaultValue;
    private AnalyticsFacetFieldConfiguration[] facetFieldConfigurations;

    public AnalyticsFacetTableConfiguration() {

    }

    @XmlAttribute(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "facet-splitter")
    public String getFacetSplitter() {
        return facetSplitter;
    }

    public void setFacetSplitter(String facetSplitter) {
        this.facetSplitter = facetSplitter;
    }

    @XmlElement(name = "facet-default-value")
    public String getFacetDefaultValue() {
        return facetDefaultValue;
    }

    public void setFacetDefaultValue(String facetDefaultValue) {
        this.facetDefaultValue = facetDefaultValue;
    }

    @XmlElementWrapper(name = "facet-fields")
    @XmlElement(name = "facet-field")
    public AnalyticsFacetFieldConfiguration[] getFacetFieldConfigurations() {
        return facetFieldConfigurations;
    }
}
