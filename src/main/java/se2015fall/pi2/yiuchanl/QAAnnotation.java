

/* First created by JCasGen Mon Sep 14 11:44:42 EDT 2015 */
package se2015fall.pi2.yiuchanl;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** this is  the super class for question and answer types annotation
 * Updated by JCasGen Mon Sep 14 17:54:44 EDT 2015
 * XML source: /Users/imlyc/Desktop/SoftwareEngineer/maven.1442157268571/pi2-yiuchanl/src/main/resources/pi2-yiuchanl-typesystem.xml
 * @generated */
public class QAAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QAAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected QAAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QAAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QAAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QAAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: confidenceScore

  /** getter for confidenceScore - gets confidence score of the annotation
   * @generated
   * @return value of the feature 
   */
  public double getConfidenceScore() {
    if (QAAnnotation_Type.featOkTst && ((QAAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "se2015fall.pi2.yiuchanl.QAAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((QAAnnotation_Type)jcasType).casFeatCode_confidenceScore);}
    
  /** setter for confidenceScore - sets confidence score of the annotation 
   * @generated
   * @param v value to set into the feature 
   */
  public void setConfidenceScore(double v) {
    if (QAAnnotation_Type.featOkTst && ((QAAnnotation_Type)jcasType).casFeat_confidenceScore == null)
      jcasType.jcas.throwFeatMissing("confidenceScore", "se2015fall.pi2.yiuchanl.QAAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QAAnnotation_Type)jcasType).casFeatCode_confidenceScore, v);}    
   
    
  //*--------------*
  //* Feature: sourceName

  /** getter for sourceName - gets name of annotation source
   * @generated
   * @return value of the feature 
   */
  public String getSourceName() {
    if (QAAnnotation_Type.featOkTst && ((QAAnnotation_Type)jcasType).casFeat_sourceName == null)
      jcasType.jcas.throwFeatMissing("sourceName", "se2015fall.pi2.yiuchanl.QAAnnotation");
    return jcasType.ll_cas.ll_getStringValue(addr, ((QAAnnotation_Type)jcasType).casFeatCode_sourceName);}
    
  /** setter for sourceName - sets name of annotation source 
   * @generated
   * @param v value to set into the feature 
   */
  public void setSourceName(String v) {
    if (QAAnnotation_Type.featOkTst && ((QAAnnotation_Type)jcasType).casFeat_sourceName == null)
      jcasType.jcas.throwFeatMissing("sourceName", "se2015fall.pi2.yiuchanl.QAAnnotation");
    jcasType.ll_cas.ll_setStringValue(addr, ((QAAnnotation_Type)jcasType).casFeatCode_sourceName, v);}    
  }

    