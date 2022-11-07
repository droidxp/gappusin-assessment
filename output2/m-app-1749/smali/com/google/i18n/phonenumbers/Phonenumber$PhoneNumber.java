public class com.google.i18n.phonenumbers.Phonenumber$PhoneNumber {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/i18n/phonenumbers/Phonenumber; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "PhoneNumber" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource; */
/* } */
} // .end annotation
/* # instance fields */
private com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource countryCodeSource_;
private Integer countryCode_;
private java.lang.String extension_;
private Boolean hasCountryCode;
private Boolean hasCountryCodeSource;
private Boolean hasExtension;
private Boolean hasItalianLeadingZero;
private Boolean hasNationalNumber;
private Boolean hasRawInput;
private Boolean italianLeadingZero_;
private Long nationalNumber_;
private java.lang.String rawInput_;
/* # direct methods */
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* iput v2, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->countryCode_:I */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->nationalNumber_:J */
final String v0 = ""; // const-string v0, ""
this.extension_ = v0;
/* iput-boolean v2, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->italianLeadingZero_:Z */
final String v0 = ""; // const-string v0, ""
this.rawInput_ = v0;
v0 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
this.countryCodeSource_ = v0;
return;
} // .end method
/* # virtual methods */
public final com.google.i18n.phonenumbers.Phonenumber$PhoneNumber clear ( ) {
/* .locals 0 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).clearCountryCode ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearCountryCode()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).clearNationalNumber ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearNationalNumber()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).clearExtension ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearExtension()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).clearItalianLeadingZero ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearItalianLeadingZero()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).clearRawInput ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearRawInput()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).clearCountryCodeSource ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearCountryCodeSource()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber clearCountryCode ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCode:Z */
/* iput v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->countryCode_:I */
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber clearCountryCodeSource ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCodeSource:Z */
v0 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
this.countryCodeSource_ = v0;
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber clearExtension ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension:Z */
final String v0 = ""; // const-string v0, ""
this.extension_ = v0;
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber clearItalianLeadingZero ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasItalianLeadingZero:Z */
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->italianLeadingZero_:Z */
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber clearNationalNumber ( ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasNationalNumber:Z */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->nationalNumber_:J */
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber clearRawInput ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasRawInput:Z */
final String v0 = ""; // const-string v0, ""
this.rawInput_ = v0;
} // .end method
public Boolean equals ( java.lang.Object p0 ) {
/* .locals 1 */
/* instance-of v0, p1, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).exactlySameAs ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->exactlySameAs(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean exactlySameAs ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 6 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* if-nez p1, :cond_1 */
/* move v0, v1 */
} // :cond_0
} // :goto_0
} // :cond_1
/* if-eq p0, p1, :cond_0 */
/* iget v2, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->countryCode_:I */
/* iget v3, p1, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->countryCode_:I */
/* if-ne v2, v3, :cond_2 */
/* iget-wide v2, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->nationalNumber_:J */
/* iget-wide v4, p1, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->nationalNumber_:J */
/* cmp-long v2, v2, v4 */
/* if-nez v2, :cond_2 */
v2 = this.extension_;
v3 = this.extension_;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* iget-boolean v2, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->italianLeadingZero_:Z */
/* iget-boolean v3, p1, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->italianLeadingZero_:Z */
/* if-ne v2, v3, :cond_2 */
v2 = this.rawInput_;
v3 = this.rawInput_;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = this.countryCodeSource_;
v3 = this.countryCodeSource_;
/* if-eq v2, v3, :cond_0 */
} // :cond_2
/* move v0, v1 */
} // .end method
public Integer getCountryCode ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->countryCode_:I */
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource getCountryCodeSource ( ) {
/* .locals 1 */
v0 = this.countryCodeSource_;
} // .end method
public java.lang.String getExtension ( ) {
/* .locals 1 */
v0 = this.extension_;
} // .end method
public Boolean getItalianLeadingZero ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->italianLeadingZero_:Z */
} // .end method
public Long getNationalNumber ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->nationalNumber_:J */
/* return-wide v0 */
} // .end method
public java.lang.String getRawInput ( ) {
/* .locals 1 */
v0 = this.rawInput_;
} // .end method
public Boolean hasCountryCode ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCode:Z */
} // .end method
public Boolean hasCountryCodeSource ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCodeSource:Z */
} // .end method
public Boolean hasExtension ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension:Z */
} // .end method
public Boolean hasItalianLeadingZero ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasItalianLeadingZero:Z */
} // .end method
public Boolean hasNationalNumber ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasNationalNumber:Z */
} // .end method
public Boolean hasRawInput ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasRawInput:Z */
} // .end method
public Integer hashCode ( ) {
/* .locals 3 */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getCountryCode ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
/* add-int/lit16 v0, v0, 0x87d */
/* mul-int/lit8 v0, v0, 0x35 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getNationalNumber ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getNationalNumber()J
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
v1 = (( java.lang.Long ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/Long;->hashCode()I
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x35 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getExtension ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v1, v0, 0x35 */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getItalianLeadingZero ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getItalianLeadingZero()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/16 v0, 0x4cf */
} // :goto_0
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x35 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getRawInput ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x35 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getCountryCodeSource ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCodeSource()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;
v1 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource ) v1 ).hashCode ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->hashCode()I
/* add-int/2addr v0, v1 */
} // :cond_0
/* const/16 v0, 0x4d5 */
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber mergeFrom ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 2 */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCode()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).setCountryCode ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCode(I)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_0
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasNationalNumber ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasNationalNumber()Z
if ( v0 != null) { // if-eqz v0, :cond_1
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getNationalNumber ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getNationalNumber()J
/* move-result-wide v0 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).setNationalNumber ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setNationalNumber(J)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_1
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasExtension ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension()Z
if ( v0 != null) { // if-eqz v0, :cond_2
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getExtension ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).setExtension ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setExtension(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_2
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasItalianLeadingZero ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasItalianLeadingZero()Z
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getItalianLeadingZero ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getItalianLeadingZero()Z
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).setItalianLeadingZero ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setItalianLeadingZero(Z)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_3
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasRawInput ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasRawInput()Z
if ( v0 != null) { // if-eqz v0, :cond_4
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getRawInput ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getRawInput()Ljava/lang/String;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).setRawInput ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setRawInput(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_4
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasCountryCodeSource ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCodeSource()Z
if ( v0 != null) { // if-eqz v0, :cond_5
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCodeSource ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCodeSource()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).setCountryCodeSource ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCodeSource(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_5
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber setCountryCode ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCode:Z */
/* iput p1, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->countryCode_:I */
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber setCountryCodeSource ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCodeSource:Z */
this.countryCodeSource_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber setExtension ( java.lang.String p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension:Z */
this.extension_ = p1;
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber setItalianLeadingZero ( Boolean p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasItalianLeadingZero:Z */
/* iput-boolean p1, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->italianLeadingZero_:Z */
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber setNationalNumber ( Long p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasNationalNumber:Z */
/* iput-wide p1, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->nationalNumber_:J */
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber setRawInput ( java.lang.String p0 ) {
/* .locals 1 */
/* if-nez p1, :cond_0 */
/* new-instance v0, Ljava/lang/NullPointerException; */
/* invoke-direct {v0}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v0 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasRawInput:Z */
this.rawInput_ = p1;
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
final String v1 = "Country Code: "; // const-string v1, "Country Code: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* iget v2, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->countryCode_:I */
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
final String v1 = " National Number: "; // const-string v1, " National Number: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* iget-wide v2, p0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->nationalNumber_:J */
(( java.lang.StringBuffer ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
v1 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).hasItalianLeadingZero ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasItalianLeadingZero()Z
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getItalianLeadingZero ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getItalianLeadingZero()Z
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = " Leading Zero: true"; // const-string v1, " Leading Zero: true"
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
v1 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).hasExtension ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension()Z
if ( v1 != null) { // if-eqz v1, :cond_1
final String v1 = " Extension: "; // const-string v1, " Extension: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.extension_;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_1
v1 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).hasCountryCodeSource ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCodeSource()Z
if ( v1 != null) { // if-eqz v1, :cond_2
final String v1 = " Country Code Source: "; // const-string v1, " Country Code Source: "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.countryCodeSource_;
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
} // :cond_2
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
