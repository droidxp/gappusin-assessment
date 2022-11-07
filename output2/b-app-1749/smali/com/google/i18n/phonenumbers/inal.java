public class inal implements java.io.Externalizable {
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/i18n/phonenumbers/Phonemetadata; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x19 */
/* name = "PhoneMetadata" */
} // .end annotation
/* # static fields */
private static final Long serialVersionUID;
/* # instance fields */
private Integer countryCode_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc fixedLine_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc generalDesc_;
private Boolean hasCountryCode;
private Boolean hasFixedLine;
private Boolean hasGeneralDesc;
private Boolean hasId;
private Boolean hasInternationalPrefix;
private Boolean hasLeadingDigits;
private Boolean hasMainCountryForCode;
private Boolean hasMobile;
private Boolean hasNationalPrefix;
private Boolean hasNationalPrefixForParsing;
private Boolean hasNationalPrefixTransformRule;
private Boolean hasNoInternationalDialling;
private Boolean hasPager;
private Boolean hasPersonalNumber;
private Boolean hasPreferredExtnPrefix;
private Boolean hasPreferredInternationalPrefix;
private Boolean hasPremiumRate;
private Boolean hasSameMobileAndFixedLinePattern;
private Boolean hasSharedCost;
private Boolean hasTollFree;
private Boolean hasUan;
private Boolean hasVoip;
private java.lang.String id_;
private java.lang.String internationalPrefix_;
private java.util.List intlNumberFormat_;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.lang.String leadingDigits_;
private Boolean mainCountryForCode_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc mobile_;
private java.lang.String nationalPrefixForParsing_;
private java.lang.String nationalPrefixTransformRule_;
private java.lang.String nationalPrefix_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc noInternationalDialling_;
private java.util.List numberFormat_;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc pager_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc personalNumber_;
private java.lang.String preferredExtnPrefix_;
private java.lang.String preferredInternationalPrefix_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc premiumRate_;
private Boolean sameMobileAndFixedLinePattern_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc sharedCost_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc tollFree_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc uan_;
private com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc voip_;
/* # direct methods */
public inal ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.generalDesc_ = v0;
this.fixedLine_ = v0;
this.mobile_ = v0;
this.tollFree_ = v0;
this.premiumRate_ = v0;
this.sharedCost_ = v0;
this.personalNumber_ = v0;
this.voip_ = v0;
this.pager_ = v0;
this.uan_ = v0;
this.noInternationalDialling_ = v0;
final String v0 = ""; // const-string v0, ""
this.id_ = v0;
/* iput v1, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->countryCode_:I */
final String v0 = ""; // const-string v0, ""
this.internationalPrefix_ = v0;
final String v0 = ""; // const-string v0, ""
this.preferredInternationalPrefix_ = v0;
final String v0 = ""; // const-string v0, ""
this.nationalPrefix_ = v0;
final String v0 = ""; // const-string v0, ""
this.preferredExtnPrefix_ = v0;
final String v0 = ""; // const-string v0, ""
this.nationalPrefixForParsing_ = v0;
final String v0 = ""; // const-string v0, ""
this.nationalPrefixTransformRule_ = v0;
/* iput-boolean v1, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->sameMobileAndFixedLinePattern_:Z */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.numberFormat_ = v0;
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.intlNumberFormat_ = v0;
/* iput-boolean v1, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->mainCountryForCode_:Z */
final String v0 = ""; // const-string v0, ""
this.leadingDigits_ = v0;
return;
} // .end method
/* # virtual methods */
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata addIntlNumberFormat ( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
v0 = this.intlNumberFormat_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata addNumberFormat ( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
v0 = this.numberFormat_;
} // .end method
public Integer getCountryCode ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->countryCode_:I */
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getFixedLine ( ) {
/* .locals 1 */
v0 = this.fixedLine_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getGeneralDesc ( ) {
/* .locals 1 */
v0 = this.generalDesc_;
} // .end method
public java.lang.String getId ( ) {
/* .locals 1 */
v0 = this.id_;
} // .end method
public java.lang.String getInternationalPrefix ( ) {
/* .locals 1 */
v0 = this.internationalPrefix_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$NumberFormat getIntlNumberFormat ( Integer p0 ) {
/* .locals 1 */
v0 = this.intlNumberFormat_;
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
} // .end method
public Integer getIntlNumberFormatCount ( ) {
/* .locals 1 */
v0 = v0 = this.intlNumberFormat_;
} // .end method
public java.util.List getIntlNumberFormatList ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;", */
/* ">;" */
/* } */
} // .end annotation
v0 = this.intlNumberFormat_;
} // .end method
public java.lang.String getLeadingDigits ( ) {
/* .locals 1 */
v0 = this.leadingDigits_;
} // .end method
public Boolean getMainCountryForCode ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->mainCountryForCode_:Z */
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getMobile ( ) {
/* .locals 1 */
v0 = this.mobile_;
} // .end method
public java.lang.String getNationalPrefix ( ) {
/* .locals 1 */
v0 = this.nationalPrefix_;
} // .end method
public java.lang.String getNationalPrefixForParsing ( ) {
/* .locals 1 */
v0 = this.nationalPrefixForParsing_;
} // .end method
public java.lang.String getNationalPrefixTransformRule ( ) {
/* .locals 1 */
v0 = this.nationalPrefixTransformRule_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getNoInternationalDialling ( ) {
/* .locals 1 */
v0 = this.noInternationalDialling_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$NumberFormat getNumberFormat ( Integer p0 ) {
/* .locals 1 */
v0 = this.numberFormat_;
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
} // .end method
public Integer getNumberFormatCount ( ) {
/* .locals 1 */
v0 = v0 = this.numberFormat_;
} // .end method
public java.util.List getNumberFormatList ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;", */
/* ">;" */
/* } */
} // .end annotation
v0 = this.numberFormat_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getPager ( ) {
/* .locals 1 */
v0 = this.pager_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getPersonalNumber ( ) {
/* .locals 1 */
v0 = this.personalNumber_;
} // .end method
public java.lang.String getPreferredExtnPrefix ( ) {
/* .locals 1 */
v0 = this.preferredExtnPrefix_;
} // .end method
public java.lang.String getPreferredInternationalPrefix ( ) {
/* .locals 1 */
v0 = this.preferredInternationalPrefix_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getPremiumRate ( ) {
/* .locals 1 */
v0 = this.premiumRate_;
} // .end method
public Boolean getSameMobileAndFixedLinePattern ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->sameMobileAndFixedLinePattern_:Z */
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getSharedCost ( ) {
/* .locals 1 */
v0 = this.sharedCost_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getTollFree ( ) {
/* .locals 1 */
v0 = this.tollFree_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getUan ( ) {
/* .locals 1 */
v0 = this.uan_;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getVoip ( ) {
/* .locals 1 */
v0 = this.voip_;
} // .end method
public Boolean hasCountryCode ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasCountryCode:Z */
} // .end method
public Boolean hasFixedLine ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasFixedLine:Z */
} // .end method
public Boolean hasGeneralDesc ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasGeneralDesc:Z */
} // .end method
public Boolean hasId ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasId:Z */
} // .end method
public Boolean hasInternationalPrefix ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasInternationalPrefix:Z */
} // .end method
public Boolean hasLeadingDigits ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasLeadingDigits:Z */
} // .end method
public Boolean hasMainCountryForCode ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasMainCountryForCode:Z */
} // .end method
public Boolean hasMobile ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasMobile:Z */
} // .end method
public Boolean hasNationalPrefix ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefix:Z */
} // .end method
public Boolean hasNationalPrefixForParsing ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefixForParsing:Z */
} // .end method
public Boolean hasNationalPrefixTransformRule ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefixTransformRule:Z */
} // .end method
public Boolean hasNoInternationalDialling ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNoInternationalDialling:Z */
} // .end method
public Boolean hasPager ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPager:Z */
} // .end method
public Boolean hasPersonalNumber ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPersonalNumber:Z */
} // .end method
public Boolean hasPreferredExtnPrefix ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredExtnPrefix:Z */
} // .end method
public Boolean hasPreferredInternationalPrefix ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredInternationalPrefix:Z */
} // .end method
public Boolean hasPremiumRate ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPremiumRate:Z */
} // .end method
public Boolean hasSameMobileAndFixedLinePattern ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasSameMobileAndFixedLinePattern:Z */
} // .end method
public Boolean hasSharedCost ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasSharedCost:Z */
} // .end method
public Boolean hasTollFree ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasTollFree:Z */
} // .end method
public Boolean hasUan ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasUan:Z */
} // .end method
public Boolean hasVoip ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasVoip:Z */
} // .end method
public void readExternal ( java.io.ObjectInput p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
v1 = int v0 = 0; // const/4 v0, 0x0
if ( v1 != null) { // if-eqz v1, :cond_0
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setGeneralDesc ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setGeneralDesc(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_1
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setFixedLine ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setFixedLine(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setMobile ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setMobile(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_3
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setTollFree ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setTollFree(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_3
if ( v1 != null) { // if-eqz v1, :cond_4
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setPremiumRate ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setPremiumRate(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_5
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setSharedCost ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setSharedCost(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_5
if ( v1 != null) { // if-eqz v1, :cond_6
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setPersonalNumber ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setPersonalNumber(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_6
if ( v1 != null) { // if-eqz v1, :cond_7
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setVoip ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setVoip(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_7
if ( v1 != null) { // if-eqz v1, :cond_8
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setPager ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setPager(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_8
if ( v1 != null) { // if-eqz v1, :cond_9
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setUan ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setUan(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_9
if ( v1 != null) { // if-eqz v1, :cond_a
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v1 ).readExternal ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setNoInternationalDialling ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setNoInternationalDialling(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
} // :cond_a
v1 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setId ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setId(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setCountryCode ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setCountryCode(I)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setInternationalPrefix ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setInternationalPrefix(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
if ( v1 != null) { // if-eqz v1, :cond_b
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setPreferredInternationalPrefix ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setPreferredInternationalPrefix(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_b
if ( v1 != null) { // if-eqz v1, :cond_c
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setNationalPrefix ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setNationalPrefix(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_c
if ( v1 != null) { // if-eqz v1, :cond_d
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setPreferredExtnPrefix ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setPreferredExtnPrefix(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_d
if ( v1 != null) { // if-eqz v1, :cond_e
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setNationalPrefixForParsing ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setNationalPrefixForParsing(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_e
if ( v1 != null) { // if-eqz v1, :cond_f
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setNationalPrefixTransformRule ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setNationalPrefixTransformRule(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = } // :cond_f
v2 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setSameMobileAndFixedLinePattern ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setSameMobileAndFixedLinePattern(Z)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
/* move v1, v0 */
} // :goto_0
/* if-ge v1, v2, :cond_10 */
/* new-instance v3, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
/* invoke-direct {v3}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v3 ).readExternal ( p1 ); // invoke-virtual {v3, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->readExternal(Ljava/io/ObjectInput;)V
v4 = this.numberFormat_;
/* add-int/lit8 v1, v1, 0x1 */
v1 = } // :cond_10
} // :goto_1
/* if-ge v0, v1, :cond_11 */
/* new-instance v2, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
/* invoke-direct {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v2 ).readExternal ( p1 ); // invoke-virtual {v2, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->readExternal(Ljava/io/ObjectInput;)V
v3 = this.intlNumberFormat_;
/* add-int/lit8 v0, v0, 0x1 */
v0 = } // :cond_11
v0 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setMainCountryForCode ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setMainCountryForCode(Z)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
if ( v0 != null) { // if-eqz v0, :cond_12
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).setLeadingDigits ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->setLeadingDigits(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
} // :cond_12
return;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setCountryCode ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasCountryCode:Z */
/* iput p1, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->countryCode_:I */
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setFixedLine ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasFixedLine:Z */
this.fixedLine_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setGeneralDesc ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasGeneralDesc:Z */
this.generalDesc_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setId ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasId:Z */
this.id_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setInternationalPrefix ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasInternationalPrefix:Z */
this.internationalPrefix_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setLeadingDigits ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasLeadingDigits:Z */
this.leadingDigits_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setMainCountryForCode ( Boolean p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasMainCountryForCode:Z */
/* iput-boolean p1, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->mainCountryForCode_:Z */
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setMobile ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasMobile:Z */
this.mobile_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setNationalPrefix ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefix:Z */
this.nationalPrefix_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setNationalPrefixForParsing ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefixForParsing:Z */
this.nationalPrefixForParsing_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setNationalPrefixTransformRule ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefixTransformRule:Z */
this.nationalPrefixTransformRule_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setNoInternationalDialling ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNoInternationalDialling:Z */
this.noInternationalDialling_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setPager ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPager:Z */
this.pager_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setPersonalNumber ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPersonalNumber:Z */
this.personalNumber_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setPreferredExtnPrefix ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredExtnPrefix:Z */
this.preferredExtnPrefix_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setPreferredInternationalPrefix ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredInternationalPrefix:Z */
this.preferredInternationalPrefix_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setPremiumRate ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPremiumRate:Z */
this.premiumRate_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setSameMobileAndFixedLinePattern ( Boolean p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasSameMobileAndFixedLinePattern:Z */
/* iput-boolean p1, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->sameMobileAndFixedLinePattern_:Z */
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setSharedCost ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasSharedCost:Z */
this.sharedCost_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setTollFree ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasTollFree:Z */
this.tollFree_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setUan ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasUan:Z */
this.uan_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata setVoip ( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasVoip:Z */
this.voip_ = p1;
} // .end method
public void writeExternal ( java.io.ObjectOutput p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
int v1 = 0; // const/4 v1, 0x0
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasGeneralDesc:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasGeneralDesc:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.generalDesc_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_0
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasFixedLine:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasFixedLine:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.fixedLine_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_1
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasMobile:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasMobile:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.mobile_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_2
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasTollFree:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasTollFree:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.tollFree_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_3
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPremiumRate:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPremiumRate:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = this.premiumRate_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_4
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasSharedCost:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasSharedCost:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = this.sharedCost_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_5
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPersonalNumber:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPersonalNumber:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = this.personalNumber_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_6
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasVoip:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasVoip:Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = this.voip_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_7
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPager:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPager:Z */
if ( v0 != null) { // if-eqz v0, :cond_8
v0 = this.pager_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_8
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasUan:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasUan:Z */
if ( v0 != null) { // if-eqz v0, :cond_9
v0 = this.uan_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_9
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNoInternationalDialling:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNoInternationalDialling:Z */
if ( v0 != null) { // if-eqz v0, :cond_a
v0 = this.noInternationalDialling_;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->writeExternal(Ljava/io/ObjectOutput;)V
} // :cond_a
v0 = this.id_;
/* iget v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->countryCode_:I */
v0 = this.internationalPrefix_;
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredInternationalPrefix:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredInternationalPrefix:Z */
if ( v0 != null) { // if-eqz v0, :cond_b
v0 = this.preferredInternationalPrefix_;
} // :cond_b
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefix:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefix:Z */
if ( v0 != null) { // if-eqz v0, :cond_c
v0 = this.nationalPrefix_;
} // :cond_c
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredExtnPrefix:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredExtnPrefix:Z */
if ( v0 != null) { // if-eqz v0, :cond_d
v0 = this.preferredExtnPrefix_;
} // :cond_d
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefixForParsing:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefixForParsing:Z */
if ( v0 != null) { // if-eqz v0, :cond_e
v0 = this.nationalPrefixForParsing_;
} // :cond_e
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefixTransformRule:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefixTransformRule:Z */
if ( v0 != null) { // if-eqz v0, :cond_f
v0 = this.nationalPrefixTransformRule_;
} // :cond_f
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->sameMobileAndFixedLinePattern_:Z */
v3 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).getNumberFormatCount ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNumberFormatCount()I
/* move v2, v1 */
} // :goto_0
/* if-ge v2, v3, :cond_10 */
v0 = this.numberFormat_;
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->writeExternal(Ljava/io/ObjectOutput;)V
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_10
v2 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p0 ).getIntlNumberFormatCount ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getIntlNumberFormatCount()I
} // :goto_1
/* if-ge v1, v2, :cond_11 */
v0 = this.intlNumberFormat_;
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).writeExternal ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->writeExternal(Ljava/io/ObjectOutput;)V
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_11
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->mainCountryForCode_:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasLeadingDigits:Z */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasLeadingDigits:Z */
if ( v0 != null) { // if-eqz v0, :cond_12
v0 = this.leadingDigits_;
} // :cond_12
return;
} // .end method
