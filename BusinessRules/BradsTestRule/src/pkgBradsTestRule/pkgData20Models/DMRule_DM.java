package pkgBradsTestRule.pkgData20Models;
import com.softwareag.rules.datamodel.IRuleAnnotation;
import com.softwareag.rules.datamodel.AbstractBaseDataModel;
import com.softwareag.rules.datamodel.IDataAnnotation;
@IRuleAnnotation(RuleProjectName="BradsTestRule",DataModelName="Rule_DM",EventTypeName="") public class DMRule_DM extends AbstractBaseDataModel {
  private static final long serialVersionUID=1L;
  private Integer slotYearofService;
  private Integer slotage;
  private Double slotpercentageIncrease;
  @IDataAnnotation(OriginalFieldName="YearofService",FieldName="slotYearofService",SlotKey="/YearofService;3.6;0",Position=0,CameFromFloat=false) public Integer getSlotYearofService(){
    return this.slotYearofService;
  }
  @IDataAnnotation(OriginalFieldName="YearofService",FieldName="slotYearofService",SlotKey="/YearofService;3.6;0",Position=0,CameFromFloat=false) public void setSlotYearofService(  Integer paramYearofService){
    this.slotYearofService=paramYearofService;
  }
  @IDataAnnotation(OriginalFieldName="YearofService",FieldName="slotYearofService",SlotKey="/YearofService;3.6;0",Position=0,CameFromFloat=false) public void setSlotYearofService(  String paramYearofService){
    if (paramYearofService != null) {
      this.slotYearofService=new Integer(paramYearofService);
    }
 else {
      this.slotYearofService=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="YearofService",FieldName="slotYearofService",SlotKey="/YearofService;3.6;0",Position=0,CameFromFloat=false) public void setSlotYearofService(  Double paramYearofService){
    if (paramYearofService != null) {
      this.slotYearofService=paramYearofService.intValue();
    }
 else {
      this.slotYearofService=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="age",FieldName="slotage",SlotKey="/age;3.6;0",Position=1,CameFromFloat=false) public Integer getSlotage(){
    return this.slotage;
  }
  @IDataAnnotation(OriginalFieldName="age",FieldName="slotage",SlotKey="/age;3.6;0",Position=1,CameFromFloat=false) public void setSlotage(  Integer paramage){
    this.slotage=paramage;
  }
  @IDataAnnotation(OriginalFieldName="age",FieldName="slotage",SlotKey="/age;3.6;0",Position=1,CameFromFloat=false) public void setSlotage(  String paramage){
    if (paramage != null) {
      this.slotage=new Integer(paramage);
    }
 else {
      this.slotage=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="age",FieldName="slotage",SlotKey="/age;3.6;0",Position=1,CameFromFloat=false) public void setSlotage(  Double paramage){
    if (paramage != null) {
      this.slotage=paramage.intValue();
    }
 else {
      this.slotage=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="percentageIncrease",FieldName="slotpercentageIncrease",SlotKey="/percentageIncrease;3.4;0",Position=2,CameFromFloat=false) public Double getSlotpercentageIncrease(){
    return this.slotpercentageIncrease;
  }
  @IDataAnnotation(OriginalFieldName="percentageIncrease",FieldName="slotpercentageIncrease",SlotKey="/percentageIncrease;3.4;0",Position=2,CameFromFloat=false) public void setSlotpercentageIncrease(  Double parampercentageIncrease){
    this.slotpercentageIncrease=parampercentageIncrease;
  }
  @IDataAnnotation(OriginalFieldName="percentageIncrease",FieldName="slotpercentageIncrease",SlotKey="/percentageIncrease;3.4;0",Position=2,CameFromFloat=false) public void setSlotpercentageIncrease(  String parampercentageIncrease){
    if (parampercentageIncrease != null) {
      this.slotpercentageIncrease=new Double(parampercentageIncrease);
    }
 else {
      this.slotpercentageIncrease=null;
    }
  }
  @IDataAnnotation(OriginalFieldName="percentageIncrease",FieldName="slotpercentageIncrease",SlotKey="/percentageIncrease;3.4;0",Position=2,CameFromFloat=false) public void setSlotpercentageIncrease(  Long parampercentageIncrease){
    if (parampercentageIncrease != null) {
      this.slotpercentageIncrease=new Double(parampercentageIncrease);
    }
 else {
      this.slotpercentageIncrease=null;
    }
  }
}
