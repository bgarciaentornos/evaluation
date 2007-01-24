/******************************************************************************
 * class TemplateItemViewParameters.java - created by whumphri@vt.edu on Oct 23, 2006
 * 
 * Copyright (c) 2007 Virginia Polytechnic Institute and State University
 * Licensed under the Educational Community License version 1.0
 * 
 * A copy of the Educational Community License has been included in this 
 * distribution and is available at: http://www.opensource.org/licenses/ecl1.php
 * 
 * Contributors:
 * Will Humphries (whumphri@vt.edu)
 *****************************************************************************/
package org.sakaiproject.evaluation.tool.params;

/**
 * This is a view parameters class which defines the variables that are passed
 * from one page to another
 * 
 * @author Sakai App Builder -AZ
 */
public class TemplateItemViewParameters extends EvalViewParameters {

  public Long templateItemId;

  public TemplateItemViewParameters() {
  }

  public TemplateItemViewParameters(String viewID, Long templateId,
      Long templateItemId) {
    this.viewID = viewID;
    this.templateId = templateId;
    this.templateItemId = templateItemId;
  }

  // RSF getParseSpec inference only works for directly derived classes of
  // SVP in 0.7
  public String getParseSpec() {
    // include a comma delimited list of the public properties in this class
    return super.getParseSpec() + ",templateId,templateItemId";
  }

}
