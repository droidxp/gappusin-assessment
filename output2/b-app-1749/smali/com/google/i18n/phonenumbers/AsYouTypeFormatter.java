public class com.google.i18n.phonenumbers.AsYouTypeFormatter {
	 /* # static fields */
	 private static final Integer MIN_LEADING_DIGITS_LENGTH;
	 private static final java.util.regex.Pattern STANDALONE_DIGIT_PATTERN;
	 /* # instance fields */
	 private final java.util.regex.Pattern CHARACTER_CLASS_PATTERN;
	 private Boolean ableToFormat;
	 private java.lang.StringBuffer accruedInput;
	 private java.lang.StringBuffer accruedInputWithoutFormatting;
	 private java.lang.String currentFormattingPattern;
	 private com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata currentMetaData;
	 private java.lang.String currentOutput;
	 private java.lang.String defaultCountry;
	 private com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata defaultMetaData;
	 private java.util.regex.Pattern digitPattern;
	 private java.lang.String digitPlaceholder;
	 private java.lang.StringBuffer formattingTemplate;
	 private java.util.regex.Pattern internationalPrefix;
	 private Boolean isExpectingCountryCode;
	 private Boolean isInternationalFormatting;
	 private Integer lastMatchPosition;
	 private java.lang.StringBuffer nationalNumber;
	 private java.util.regex.Pattern nationalPrefixForParsing;
	 private Integer originalPosition;
	 private final com.google.i18n.phonenumbers.PhoneNumberUtil phoneUtil;
	 private Integer positionToRemember;
	 private java.util.List possibleFormats;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.lang.StringBuffer prefixBeforeNationalNumber;
private com.google.i18n.phonenumbers.RegexCache regexCache;
/* # direct methods */
static com.google.i18n.phonenumbers.AsYouTypeFormatter ( ) {
/* .locals 1 */
final String v0 = "\\d(?=[^,}][^,}])"; // const-string v0, "\\d(?=[^,}][^,}])"
java.util.regex.Pattern .compile ( v0 );
return;
} // .end method
 com.google.i18n.phonenumbers.AsYouTypeFormatter ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
final String v0 = ""; // const-string v0, ""
this.currentOutput = v0;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
this.formattingTemplate = v0;
final String v0 = ""; // const-string v0, ""
this.currentFormattingPattern = v0;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
this.accruedInput = v0;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
this.accruedInputWithoutFormatting = v0;
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
/* iput-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isInternationalFormatting:Z */
/* iput-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isExpectingCountryCode:Z */
com.google.i18n.phonenumbers.PhoneNumberUtil .getInstance ( );
this.phoneUtil = v0;
final String v0 = "\\[([^\\[\\]])*\\]"; // const-string v0, "\\[([^\\[\\]])*\\]"
java.util.regex.Pattern .compile ( v0 );
this.CHARACTER_CLASS_PATTERN = v0;
final String v0 = "\u2008"; // const-string v0, "\u2008"
this.digitPlaceholder = v0;
v0 = this.digitPlaceholder;
java.util.regex.Pattern .compile ( v0 );
this.digitPattern = v0;
/* iput v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->lastMatchPosition:I */
/* iput v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->originalPosition:I */
/* iput v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->positionToRemember:I */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
this.prefixBeforeNationalNumber = v0;
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
this.nationalNumber = v0;
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.possibleFormats = v0;
/* new-instance v0, Lcom/google/i18n/phonenumbers/RegexCache; */
/* const/16 v1, 0x40 */
/* invoke-direct {v0, v1}, Lcom/google/i18n/phonenumbers/RegexCache;-><init>(I)V */
this.regexCache = v0;
this.defaultCountry = p1;
v0 = this.defaultCountry;
/* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->initializeCountrySpecificInfo(Ljava/lang/String;)V */
v0 = this.currentMetaData;
this.defaultMetaData = v0;
return;
} // .end method
private java.lang.String attemptToChooseFormattingPattern ( ) {
/* .locals 3 */
int v2 = 3; // const/4 v2, 0x3
v0 = this.nationalNumber;
v0 = (( java.lang.StringBuffer ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I
/* if-lt v0, v2, :cond_0 */
v0 = this.nationalNumber;
int v1 = 0; // const/4 v1, 0x0
(( java.lang.StringBuffer ) v0 ).substring ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->getAvailableFormats(Ljava/lang/String;)V */
/* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->maybeCreateNewTemplate()Z */
/* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->inputAccruedNationalNumber()Ljava/lang/String; */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.prefixBeforeNationalNumber;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
v1 = this.nationalNumber;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
private Boolean attemptToExtractCountryCode ( ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
v1 = this.nationalNumber;
v1 = (( java.lang.StringBuffer ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I
/* if-nez v1, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1}, Ljava/lang/StringBuffer;-><init>()V */
v2 = this.phoneUtil;
v3 = this.nationalNumber;
v2 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) v2 ).extractCountryCode ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->extractCountryCode(Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;)I
if ( v2 != null) { // if-eqz v2, :cond_0
v3 = this.nationalNumber;
(( java.lang.StringBuffer ) v3 ).setLength ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->setLength(I)V
v0 = this.nationalNumber;
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
v0 = this.phoneUtil;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) v0 ).getRegionCodeForCountryCode ( v2 ); // invoke-virtual {v0, v2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;
v1 = this.defaultCountry;
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
/* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->initializeCountrySpecificInfo(Ljava/lang/String;)V */
} // :cond_2
java.lang.Integer .toString ( v2 );
v1 = this.prefixBeforeNationalNumber;
(( java.lang.StringBuffer ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
int v0 = 1; // const/4 v0, 0x1
} // .end method
private Boolean attemptToExtractIdd ( ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
v2 = this.internationalPrefix;
v3 = this.accruedInputWithoutFormatting;
(( java.util.regex.Pattern ) v2 ).matcher ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v3 = (( java.util.regex.Matcher ) v2 ).lookingAt ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isInternationalFormatting:Z */
v2 = (( java.util.regex.Matcher ) v2 ).end ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I
v3 = this.nationalNumber;
(( java.lang.StringBuffer ) v3 ).setLength ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->setLength(I)V
v3 = this.nationalNumber;
v4 = this.accruedInputWithoutFormatting;
(( java.lang.StringBuffer ) v4 ).substring ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuffer;->substring(I)Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v3 = this.prefixBeforeNationalNumber;
v4 = this.accruedInputWithoutFormatting;
(( java.lang.StringBuffer ) v4 ).substring ( v1, v2 ); // invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;
(( java.lang.StringBuffer ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v2 = this.accruedInputWithoutFormatting;
v1 = (( java.lang.StringBuffer ) v2 ).charAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->charAt(I)C
/* const/16 v2, 0x2b */
/* if-eq v1, v2, :cond_0 */
v1 = this.prefixBeforeNationalNumber;
final String v2 = " "; // const-string v2, " "
(( java.lang.StringBuffer ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
} // :goto_0
} // :cond_1
/* move v0, v1 */
} // .end method
private Boolean createFormattingTemplate ( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat p0 ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) p1 ).getFormat ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getFormat()Ljava/lang/String;
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) p1 ).getPattern ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getPattern()Ljava/lang/String;
/* const/16 v3, 0x7c */
v3 = (( java.lang.String ) v2 ).indexOf ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I
int v4 = -1; // const/4 v4, -0x1
/* if-eq v3, v4, :cond_0 */
} // :goto_0
} // :cond_0
v3 = this.CHARACTER_CLASS_PATTERN;
(( java.util.regex.Pattern ) v3 ).matcher ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v3 = "\\\\d"; // const-string v3, "\\\\d"
(( java.util.regex.Matcher ) v2 ).replaceAll ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
v3 = com.google.i18n.phonenumbers.AsYouTypeFormatter.STANDALONE_DIGIT_PATTERN;
(( java.util.regex.Pattern ) v3 ).matcher ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v3 = "\\\\d"; // const-string v3, "\\\\d"
(( java.util.regex.Matcher ) v2 ).replaceAll ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
v3 = this.formattingTemplate;
(( java.lang.StringBuffer ) v3 ).setLength ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->setLength(I)V
v0 = this.formattingTemplate;
/* invoke-direct {p0, v2, v1}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->getFormattingTemplate(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String; */
(( java.lang.StringBuffer ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
int v0 = 1; // const/4 v0, 0x1
} // .end method
private void getAvailableFormats ( java.lang.String p0 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isInternationalFormatting:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.currentMetaData;
v0 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getIntlNumberFormatCount ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getIntlNumberFormatCount()I
/* if-lez v0, :cond_0 */
v0 = this.currentMetaData;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getIntlNumberFormatList ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getIntlNumberFormatList()Ljava/util/List;
} // :goto_0
v1 = this.possibleFormats;
/* invoke-direct {p0, p1}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->narrowDownPossibleFormats(Ljava/lang/String;)V */
return;
} // :cond_0
v0 = this.currentMetaData;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getNumberFormatList ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNumberFormatList()Ljava/util/List;
} // .end method
private java.lang.String getFormattingTemplate ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
final String v0 = "999999999999999"; // const-string v0, "999999999999999"
v1 = this.regexCache;
(( com.google.i18n.phonenumbers.RegexCache ) v1 ).getPatternForRegex ( p1 ); // invoke-virtual {v1, p1}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v1 ).matcher ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
(( java.util.regex.Matcher ) v0 ).find ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
(( java.util.regex.Matcher ) v0 ).group ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->group()Ljava/lang/String;
(( java.lang.String ) v0 ).replaceAll ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
final String v1 = "9"; // const-string v1, "9"
v2 = this.digitPlaceholder;
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
private void initializeCountrySpecificInfo ( java.lang.String p0 ) {
/* .locals 3 */
v0 = this.phoneUtil;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) v0 ).getMetadataForRegion ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
this.currentMetaData = v0;
v0 = this.regexCache;
v1 = this.currentMetaData;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v1 ).getNationalPrefixForParsing ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNationalPrefixForParsing()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v0 ).getPatternForRegex ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
this.nationalPrefixForParsing = v0;
v0 = this.regexCache;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "\\+|"; // const-string v2, "\\+|"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.currentMetaData;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v2 ).getInternationalPrefix ( ); // invoke-virtual {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getInternationalPrefix()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v0 ).getPatternForRegex ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
this.internationalPrefix = v0;
return;
} // .end method
private java.lang.String inputAccruedNationalNumber ( ) {
/* .locals 5 */
v0 = this.nationalNumber;
v3 = (( java.lang.StringBuffer ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I
/* if-lez v3, :cond_2 */
final String v1 = ""; // const-string v1, ""
int v0 = 0; // const/4 v0, 0x0
/* move v4, v0 */
/* move-object v0, v1 */
/* move v1, v4 */
} // :goto_0
/* if-ge v1, v3, :cond_0 */
v0 = this.nationalNumber;
v0 = (( java.lang.StringBuffer ) v0 ).charAt ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->charAt(I)C
/* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->inputDigitHelper(C)Ljava/lang/String; */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* move-object v0, v2 */
} // :cond_0
/* iget-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = this.prefixBeforeNationalNumber;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_1
} // :goto_1
} // :cond_2
v0 = this.prefixBeforeNationalNumber;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
private java.lang.String inputDigitHelper ( Object p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
v0 = this.digitPattern;
v1 = this.formattingTemplate;
(( java.util.regex.Pattern ) v0 ).matcher ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/* iget v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->lastMatchPosition:I */
v1 = (( java.util.regex.Matcher ) v0 ).find ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->find(I)Z
if ( v1 != null) { // if-eqz v1, :cond_0
java.lang.Character .toString ( p1 );
(( java.util.regex.Matcher ) v0 ).replaceFirst ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
v2 = this.formattingTemplate;
v3 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
(( java.lang.StringBuffer ) v2 ).replace ( v4, v3, v1 ); // invoke-virtual {v2, v4, v3, v1}, Ljava/lang/StringBuffer;->replace(IILjava/lang/String;)Ljava/lang/StringBuffer;
v0 = (( java.util.regex.Matcher ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I
/* iput v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->lastMatchPosition:I */
v0 = this.formattingTemplate;
/* iget v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->lastMatchPosition:I */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuffer ) v0 ).substring ( v4, v1 ); // invoke-virtual {v0, v4, v1}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;
} // :goto_0
} // :cond_0
/* iput-boolean v4, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
v0 = this.accruedInput;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
private java.lang.String inputDigitWithOptionToRememberPosition ( Object p0, Boolean p1 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.accruedInput;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
if ( p2 != null) { // if-eqz p2, :cond_0
v0 = this.accruedInput;
v0 = (( java.lang.StringBuffer ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I
/* iput v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->originalPosition:I */
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_START_CHAR_PATTERN;
java.lang.Character .toString ( p1 );
(( java.util.regex.Pattern ) v0 ).matcher ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
/* if-nez v0, :cond_1 */
/* iput-boolean v2, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
} // :cond_1
/* iget-boolean v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
/* if-nez v0, :cond_3 */
v0 = this.accruedInput;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_2
} // :goto_0
} // :cond_3
v0 = /* invoke-direct {p0, p1, p2}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->normalizeAndAccrueDigitsAndPlusSign(CZ)C */
v1 = this.accruedInputWithoutFormatting;
v1 = (( java.lang.StringBuffer ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->length()I
/* packed-switch v1, :pswitch_data_0 */
} // :cond_4
v1 = v1 = this.possibleFormats;
/* if-lez v1, :cond_a */
/* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->inputDigitHelper(C)Ljava/lang/String; */
(( com.google.i18n.phonenumbers.AsYouTypeFormatter ) p0 ).attemptToFormatAccruedDigits ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->attemptToFormatAccruedDigits()Ljava/lang/String;
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_8 */
/* move-object v0, v1 */
/* :pswitch_0 */
v0 = this.accruedInput;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* :pswitch_1 */
v1 = /* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->attemptToExtractIdd()Z */
if ( v1 != null) { // if-eqz v1, :cond_6
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isExpectingCountryCode:Z */
/* :pswitch_2 */
/* iget-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isExpectingCountryCode:Z */
if ( v1 != null) { // if-eqz v1, :cond_7
v0 = /* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->attemptToExtractCountryCode()Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* iput-boolean v2, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isExpectingCountryCode:Z */
} // :cond_5
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.prefixBeforeNationalNumber;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
v1 = this.nationalNumber;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_6
/* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->removeNationalPrefixFromNationalNumber()V */
/* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->attemptToChooseFormattingPattern()Ljava/lang/String; */
} // :cond_7
/* :pswitch_3 */
/* iget-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isExpectingCountryCode:Z */
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = /* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->attemptToExtractCountryCode()Z */
/* if-nez v1, :cond_4 */
/* iput-boolean v2, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
v0 = this.accruedInput;
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_8
v1 = this.nationalNumber;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* invoke-direct {p0, v1}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->narrowDownPossibleFormats(Ljava/lang/String;)V */
v1 = /* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->maybeCreateNewTemplate()Z */
if ( v1 != null) { // if-eqz v1, :cond_9
/* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->inputAccruedNationalNumber()Ljava/lang/String; */
/* goto/16 :goto_0 */
} // :cond_9
/* iget-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = this.prefixBeforeNationalNumber;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* goto/16 :goto_0 */
} // :cond_a
/* invoke-direct {p0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->attemptToChooseFormattingPattern()Ljava/lang/String; */
/* goto/16 :goto_0 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
private Boolean maybeCreateNewTemplate ( ) {
/* .locals 5 */
int v1 = 0; // const/4 v1, 0x0
v0 = this.possibleFormats;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getPattern ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getPattern()Ljava/lang/String;
v4 = this.currentFormattingPattern;
v4 = (( java.lang.String ) v4 ).equals ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* move v0, v1 */
} // :goto_0
} // :cond_1
v0 = /* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->createFormattingTemplate(Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
this.currentFormattingPattern = v3;
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
/* iput-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
/* move v0, v1 */
} // .end method
private void narrowDownPossibleFormats ( java.lang.String p0 ) {
/* .locals 4 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* add-int/lit8 v1, v0, -0x3 */
v0 = this.possibleFormats;
} // :cond_0
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
v3 = (( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getLeadingDigitsPatternCount ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getLeadingDigitsPatternCount()I
/* if-le v3, v1, :cond_0 */
v3 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getLeadingDigitsPattern ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getLeadingDigitsPattern(I)Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v3 ).getPatternForRegex ( v0 ); // invoke-virtual {v3, v0}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v0 ).matcher ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).lookingAt ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z
/* if-nez v0, :cond_0 */
} // :cond_1
return;
} // .end method
private Object normalizeAndAccrueDigitsAndPlusSign ( Object p0, Boolean p1 ) {
/* .locals 2 */
/* const/16 v0, 0x2b */
/* if-ne p1, v0, :cond_0 */
v0 = this.accruedInputWithoutFormatting;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.DIGIT_MAPPINGS;
v0 = java.lang.Character .valueOf ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.DIGIT_MAPPINGS;
java.lang.Character .valueOf ( p1 );
/* check-cast v0, Ljava/lang/Character; */
p1 = (( java.lang.Character ) v0 ).charValue ( ); // invoke-virtual {v0}, Ljava/lang/Character;->charValue()C
v0 = this.accruedInputWithoutFormatting;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
v0 = this.nationalNumber;
(( java.lang.StringBuffer ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :cond_1
if ( p2 != null) { // if-eqz p2, :cond_2
v0 = this.accruedInputWithoutFormatting;
v0 = (( java.lang.StringBuffer ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->length()I
/* iput v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->positionToRemember:I */
} // :cond_2
} // .end method
private void removeNationalPrefixFromNationalNumber ( ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
v2 = this.currentMetaData;
v2 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v2 ).getCountryCode ( ); // invoke-virtual {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getCountryCode()I
/* if-ne v2, v0, :cond_0 */
v2 = this.nationalNumber;
v2 = (( java.lang.StringBuffer ) v2 ).charAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->charAt(I)C
/* const/16 v3, 0x31 */
/* if-ne v2, v3, :cond_0 */
v2 = this.prefixBeforeNationalNumber;
final String v3 = "1 "; // const-string v3, "1 "
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isInternationalFormatting:Z */
} // :goto_0
v2 = this.nationalNumber;
(( java.lang.StringBuffer ) v2 ).delete ( v1, v0 ); // invoke-virtual {v2, v1, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
return;
} // :cond_0
v2 = this.currentMetaData;
v2 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v2 ).hasNationalPrefix ( ); // invoke-virtual {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefix()Z
if ( v2 != null) { // if-eqz v2, :cond_1
v2 = this.nationalPrefixForParsing;
v3 = this.nationalNumber;
(( java.util.regex.Pattern ) v2 ).matcher ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v3 = (( java.util.regex.Matcher ) v2 ).lookingAt ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isInternationalFormatting:Z */
v0 = (( java.util.regex.Matcher ) v2 ).end ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I
v2 = this.prefixBeforeNationalNumber;
v3 = this.nationalNumber;
(( java.lang.StringBuffer ) v3 ).substring ( v1, v0 ); // invoke-virtual {v3, v1, v0}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_1
/* move v0, v1 */
} // .end method
/* # virtual methods */
java.lang.String attemptToFormatAccruedDigits ( ) {
/* .locals 4 */
v0 = this.possibleFormats;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
v2 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getPattern ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getPattern()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v2 ).getPatternForRegex ( v3 ); // invoke-virtual {v2, v3}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
v3 = this.nationalNumber;
(( java.util.regex.Pattern ) v2 ).matcher ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v3 = (( java.util.regex.Matcher ) v2 ).matches ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z
if ( v3 != null) { // if-eqz v3, :cond_0
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getFormat ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getFormat()Ljava/lang/String;
(( java.util.regex.Matcher ) v2 ).replaceAll ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = this.prefixBeforeNationalNumber;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
} // :cond_1
final String v0 = ""; // const-string v0, ""
} // .end method
public void clear ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
final String v0 = ""; // const-string v0, ""
this.currentOutput = v0;
v0 = this.accruedInput;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
v0 = this.accruedInputWithoutFormatting;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
v0 = this.formattingTemplate;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
/* iput v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->lastMatchPosition:I */
final String v0 = ""; // const-string v0, ""
this.currentFormattingPattern = v0;
v0 = this.prefixBeforeNationalNumber;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
v0 = this.nationalNumber;
(( java.lang.StringBuffer ) v0 ).setLength ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuffer;->setLength(I)V
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
/* iput v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->positionToRemember:I */
/* iput v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->originalPosition:I */
/* iput-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isInternationalFormatting:Z */
/* iput-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->isExpectingCountryCode:Z */
v0 = this.possibleFormats;
v0 = this.currentMetaData;
v1 = this.defaultMetaData;
v0 = (( java.lang.Object ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
v0 = this.defaultCountry;
/* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->initializeCountrySpecificInfo(Ljava/lang/String;)V */
} // :cond_0
return;
} // .end method
public Integer getRememberedPosition ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
/* iget-boolean v1, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->ableToFormat:Z */
/* if-nez v1, :cond_1 */
/* iget v0, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->originalPosition:I */
} // :cond_0
} // :cond_1
v1 = this.currentOutput;
v2 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* move v1, v0 */
} // :goto_0
/* iget v3, p0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->positionToRemember:I */
/* if-ge v1, v3, :cond_0 */
/* if-ge v0, v2, :cond_0 */
v3 = this.accruedInputWithoutFormatting;
v3 = (( java.lang.StringBuffer ) v3 ).charAt ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->charAt(I)C
v4 = this.currentOutput;
v4 = (( java.lang.String ) v4 ).charAt ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/String;->charAt(I)C
/* if-ne v3, v4, :cond_2 */
/* add-int/lit8 v1, v1, 0x1 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public java.lang.String inputDigit ( Object p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->inputDigitWithOptionToRememberPosition(CZ)Ljava/lang/String; */
this.currentOutput = v0;
v0 = this.currentOutput;
} // .end method
public java.lang.String inputDigitAndRememberPosition ( Object p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;->inputDigitWithOptionToRememberPosition(CZ)Ljava/lang/String; */
this.currentOutput = v0;
v0 = this.currentOutput;
} // .end method
