package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Sep 19 08:50:54 CEST 2015
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Error event sent when required params are missing.
 * 
 * Defined in file: events.json
 * Generated by: Model
 *********************************************************/

public class MissingParams_impl_ari_0_0_1 extends Message_impl_ari_0_0_1 implements MissingParams, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  A list of the missing parameters  */
  private List<String> params;
 public List<String> getParams() {
   return params;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setParams(List<String> val ) {
   params = val;
 }

/** No missing signatures from interface */
}

