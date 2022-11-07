public class com.google.i18n.phonenumbers.PhoneNumberUtil {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/i18n/phonenumbers/PhoneNumberUtil$1;, */
	 /* Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;, */
	 /* Lcom/google/i18n/phonenumbers/PhoneNumberUtil$MatchType;, */
	 /* Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType;, */
	 /* Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.util.Map ALL_NORMALIZATION_MAPPINGS;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Character;", */
/* "Ljava/lang/Character;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.Map ALPHA_MAPPINGS;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Character;", */
/* "Ljava/lang/Character;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.regex.Pattern CAPTURING_DIGIT_PATTERN;
private static final java.util.regex.Pattern CC_PATTERN;
static final java.lang.String COUNTRY_CODE_TO_REGION_CODE_MAP_CLASS_NAME;
private static final java.lang.String DEFAULT_EXTN_PREFIX;
static final java.util.Map DIGIT_MAPPINGS;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Character;", */
/* "Ljava/lang/Character;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.regex.Pattern EXTN_PATTERN;
private static final java.util.regex.Pattern FG_PATTERN;
private static final java.util.regex.Pattern FIRST_GROUP_PATTERN;
static final java.lang.String KNOWN_EXTN_PATTERNS;
private static final java.util.Set LEADING_ZERO_COUNTRIES;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static final java.util.logging.Logger LOGGER;
static final Integer MAX_LENGTH_COUNTRY_CODE;
static final Integer MAX_LENGTH_FOR_NSN;
static final java.lang.String META_DATA_FILE_PREFIX;
private static final Integer MIN_LENGTH_FOR_NSN;
private static final Integer NANPA_COUNTRY_CODE;
private static final java.util.regex.Pattern NON_DIGITS_PATTERN;
private static final java.util.regex.Pattern NP_PATTERN;
static final java.lang.String PLUS_CHARS;
private static final java.util.regex.Pattern PLUS_CHARS_PATTERN;
static final Object PLUS_SIGN;
static final Integer REGEX_FLAGS;
private static final java.lang.String SECOND_NUMBER_START;
static final java.util.regex.Pattern SECOND_NUMBER_START_PATTERN;
private static final java.util.regex.Pattern UNIQUE_INTERNATIONAL_PREFIX;
private static final java.lang.String UNKNOWN_REGION;
private static final java.lang.String UNWANTED_END_CHARS;
private static final java.util.regex.Pattern UNWANTED_END_CHAR_PATTERN;
private static final java.lang.String VALID_ALPHA;
private static final java.util.regex.Pattern VALID_ALPHA_PHONE_PATTERN;
private static final java.lang.String VALID_DIGITS;
private static final java.lang.String VALID_PHONE_NUMBER;
private static final java.util.regex.Pattern VALID_PHONE_NUMBER_PATTERN;
static final java.lang.String VALID_PUNCTUATION;
private static final java.lang.String VALID_START_CHAR;
static final java.util.regex.Pattern VALID_START_CHAR_PATTERN;
private static com.google.i18n.phonenumbers.PhoneNumberUtil instance;
/* # instance fields */
private java.util.Map countryCodeToRegionCodeMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;>;" */
/* } */
} // .end annotation
} // .end field
private java.util.Map countryToMetadataMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.lang.String currentFilePrefix;
private final java.util.Set nanpaCountries;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private com.google.i18n.phonenumbers.RegexCache regexCache;
private final java.util.Set supportedCountries;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.google.i18n.phonenumbers.PhoneNumberUtil ( ) {
/* .locals 9 */
/* const/16 v8, 0x34 */
/* const/16 v7, 0x33 */
/* const/16 v6, 0x39 */
/* const/16 v5, 0x37 */
/* const/16 v4, 0x32 */
/* const-class v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
java.util.logging.Logger .getLogger ( v0 );
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0, v4}, Ljava/util/HashMap;-><init>(I)V */
/* const/16 v1, 0x30 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x30 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff10 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x30 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x660 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x30 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f0 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x30 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x31 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x31 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff11 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x31 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x661 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x31 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f1 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x31 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
java.lang.Character .valueOf ( v4 );
java.lang.Character .valueOf ( v4 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff12 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v4 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x662 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v4 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f2 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v4 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
java.lang.Character .valueOf ( v7 );
java.lang.Character .valueOf ( v7 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff13 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v7 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x663 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v7 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f3 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v7 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
java.lang.Character .valueOf ( v8 );
java.lang.Character .valueOf ( v8 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff14 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v8 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x664 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v8 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f4 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v8 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x35 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x35 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff15 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x35 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x665 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x35 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f5 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x35 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x36 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x36 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff16 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x36 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x666 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x36 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f6 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x36 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
java.lang.Character .valueOf ( v5 );
java.lang.Character .valueOf ( v5 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff17 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v5 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x667 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v5 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f7 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v5 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x38 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x38 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff18 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x38 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x668 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x38 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f8 */
java.lang.Character .valueOf ( v1 );
/* const/16 v2, 0x38 */
java.lang.Character .valueOf ( v2 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
java.lang.Character .valueOf ( v6 );
java.lang.Character .valueOf ( v6 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const v1, 0xff19 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v6 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x669 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v6 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v1, 0x6f9 */
java.lang.Character .valueOf ( v1 );
java.lang.Character .valueOf ( v6 );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
java.util.Collections .unmodifiableMap ( v0 );
/* new-instance v1, Ljava/util/HashMap; */
/* const/16 v2, 0x28 */
/* invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(I)V */
/* const/16 v2, 0x41 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v4 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x42 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v4 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x43 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v4 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x44 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v7 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x45 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v7 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x46 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v7 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x47 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v8 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x48 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v8 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x49 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v8 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x4a */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x35 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x4b */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x35 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x4c */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x35 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x4d */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x36 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x4e */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x36 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x4f */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x36 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x50 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v5 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x51 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v5 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x52 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v5 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x53 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v5 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x54 */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x38 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x55 */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x38 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x56 */
java.lang.Character .valueOf ( v2 );
/* const/16 v3, 0x38 */
java.lang.Character .valueOf ( v3 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x57 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v6 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x58 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v6 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x59 */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v6 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* const/16 v2, 0x5a */
java.lang.Character .valueOf ( v2 );
java.lang.Character .valueOf ( v6 );
(( java.util.HashMap ) v1 ).put ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
java.util.Collections .unmodifiableMap ( v1 );
/* new-instance v2, Ljava/util/HashMap; */
/* const/16 v3, 0x64 */
/* invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(I)V */
(( java.util.HashMap ) v2 ).putAll ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
(( java.util.HashMap ) v2 ).putAll ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V
java.util.Collections .unmodifiableMap ( v2 );
/* new-instance v0, Ljava/util/HashSet; */
/* const/16 v1, 0xa */
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V */
/* const/16 v1, 0x27 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0x2f */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0xe1 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0xe3 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0xe4 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0xf1 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0xf2 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0x10c */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0x17a */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0x17b */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
/* const/16 v1, 0x1f5 */
java.lang.Integer .valueOf ( v1 );
(( java.util.HashSet ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
java.util.Collections .unmodifiableSet ( v0 );
final String v0 = "[\\d]+(?:[~\u2053\u223c\uff5e][\\d]+)?"; // const-string v0, "[\\d]+(?:[~\u2053\u223c\uff5e][\\d]+)?"
java.util.regex.Pattern .compile ( v0 );
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.DIGIT_MAPPINGS;
java.util.Arrays .toString ( v0 );
final String v1 = "[, \\[\\]]"; // const-string v1, "[, \\[\\]]"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) v0 ).replaceAll ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.ALPHA_MAPPINGS;
java.util.Arrays .toString ( v1 );
final String v2 = "[, \\[\\]]"; // const-string v2, "[, \\[\\]]"
final String v3 = ""; // const-string v3, ""
(( java.lang.String ) v1 ).replaceAll ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.ALPHA_MAPPINGS;
java.util.Arrays .toString ( v1 );
(( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v2 = "[, \\[\\]]"; // const-string v2, "[, \\[\\]]"
final String v3 = ""; // const-string v3, ""
(( java.lang.String ) v1 ).replaceAll ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v0 = "[+\uff0b]+"; // const-string v0, "[+\uff0b]+"
java.util.regex.Pattern .compile ( v0 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "(["; // const-string v1, "(["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_DIGITS;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "])"; // const-string v1, "])"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
java.util.regex.Pattern .compile ( v0 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "[+\uff0b"; // const-string v1, "[+\uff0b"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_DIGITS;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_START_CHAR;
java.util.regex.Pattern .compile ( v0 );
final String v0 = "[\\\\/] *x"; // const-string v0, "[\\\\/] *x"
java.util.regex.Pattern .compile ( v0 );
final String v0 = "[[\\P{N}&&\\P{L}]&&[^#]]+$"; // const-string v0, "[[\\P{N}&&\\P{L}]&&[^#]]+$"
java.util.regex.Pattern .compile ( v0 );
final String v0 = "(?:.*?[A-Za-z]){3}.*"; // const-string v0, "(?:.*?[A-Za-z]){3}.*"
java.util.regex.Pattern .compile ( v0 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "[+\uff0b]*(?:[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]*["; // const-string v1, "[+\uff0b]*(?:[-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e]*["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_DIGITS;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "]){3,}["; // const-string v1, "]){3,}["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e"; // const-string v1, "-x\u2010-\u2015\u2212\u30fc\uff0d-\uff0f \u00a0\u200b\u2060\u3000()\uff08\uff09\uff3b\uff3d.\\[\\]/~\u2053\u223c\uff5e"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_ALPHA;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_DIGITS;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "]*"; // const-string v1, "]*"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "[ \u00a0\\t,]*(?:ext(?:ensi(?:o\u0301?|\u00f3))?n?|\uff45\uff58\uff54\uff4e?|[,x\uff58#\uff03~\uff5e]|int|anexo|\uff49\uff4e\uff54)[:\\.\uff0e]?[ \u00a0\\t,-]*(["; // const-string v1, "[ \u00a0\\t,]*(?:ext(?:ensi(?:o\u0301?|\u00f3))?n?|\uff45\uff58\uff54\uff4e?|[,x\uff58#\uff03~\uff5e]|int|anexo|\uff49\uff4e\uff54)[:\\.\uff0e]?[ \u00a0\\t,-]*(["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_DIGITS;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "]{1,7})#?|[- ]+(["; // const-string v1, "]{1,7})#?|[- ]+(["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_DIGITS;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "]{1,5})#"; // const-string v1, "]{1,5})#"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "(?:"; // const-string v1, "(?:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.KNOWN_EXTN_PATTERNS;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")$"; // const-string v1, ")$"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0x42 */
java.util.regex.Pattern .compile ( v0,v1 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_PHONE_NUMBER;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "(?:"; // const-string v1, "(?:"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.KNOWN_EXTN_PATTERNS;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")?"; // const-string v1, ")?"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/16 v1, 0x42 */
java.util.regex.Pattern .compile ( v0,v1 );
final String v0 = "(\\D+)"; // const-string v0, "(\\D+)"
java.util.regex.Pattern .compile ( v0 );
final String v0 = "(\\$1)"; // const-string v0, "(\\$1)"
java.util.regex.Pattern .compile ( v0 );
final String v0 = "\\$NP"; // const-string v0, "\\$NP"
java.util.regex.Pattern .compile ( v0 );
final String v0 = "\\$FG"; // const-string v0, "\\$FG"
java.util.regex.Pattern .compile ( v0 );
final String v0 = "\\$CC"; // const-string v0, "\\$CC"
java.util.regex.Pattern .compile ( v0 );
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
private com.google.i18n.phonenumbers.PhoneNumberUtil ( ) {
/* .locals 2 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
final String v0 = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto"; // const-string v0, "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto"
this.currentFilePrefix = v0;
int v0 = 0; // const/4 v0, 0x0
this.countryCodeToRegionCodeMap = v0;
/* new-instance v0, Ljava/util/HashSet; */
/* const/16 v1, 0x12c */
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V */
this.supportedCountries = v0;
/* new-instance v0, Ljava/util/HashSet; */
/* const/16 v1, 0x23 */
/* invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V */
this.nanpaCountries = v0;
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.countryToMetadataMap = v0;
/* new-instance v0, Lcom/google/i18n/phonenumbers/RegexCache; */
/* const/16 v1, 0x64 */
/* invoke-direct {v0, v1}, Lcom/google/i18n/phonenumbers/RegexCache;-><init>(I)V */
this.regexCache = v0;
return;
} // .end method
private Boolean checkRegionForParsing ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
v0 = /* invoke-direct {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.PLUS_CHARS_PATTERN;
(( java.util.regex.Pattern ) v0 ).matcher ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).lookingAt ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z
/* if-nez v0, :cond_1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static java.lang.String convertAlphaCharactersInNumber ( java.lang.String p0 ) {
/* .locals 2 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.ALL_NORMALIZATION_MAPPINGS;
int v1 = 0; // const/4 v1, 0x0
com.google.i18n.phonenumbers.PhoneNumberUtil .normalizeHelper ( p0,v0,v1 );
} // .end method
static java.lang.String extractPossibleNumber ( java.lang.String p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_START_CHAR_PATTERN;
(( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v1 = (( java.util.regex.Matcher ) v0 ).find ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
if ( v1 != null) { // if-eqz v1, :cond_2
v0 = (( java.util.regex.Matcher ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->start()I
(( java.lang.String ) p0 ).substring ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.UNWANTED_END_CHAR_PATTERN;
(( java.util.regex.Pattern ) v1 ).matcher ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v2 = (( java.util.regex.Matcher ) v1 ).find ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z
if ( v2 != null) { // if-eqz v2, :cond_0
v1 = (( java.util.regex.Matcher ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I
(( java.lang.String ) v0 ).substring ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_0
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.SECOND_NUMBER_START_PATTERN;
(( java.util.regex.Pattern ) v1 ).matcher ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v2 = (( java.util.regex.Matcher ) v1 ).find ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z
if ( v2 != null) { // if-eqz v2, :cond_1
v1 = (( java.util.regex.Matcher ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I
(( java.lang.String ) v0 ).substring ( v3, v1 ); // invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // :cond_1
} // :goto_0
} // :cond_2
final String v0 = ""; // const-string v0, ""
} // .end method
private java.lang.String formatAccordingToFormats ( java.lang.String p0, java.util.List p1, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat p2 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;", */
/* ">;", */
/* "Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;", */
/* ")", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatAccordingToFormats(Ljava/lang/String;Ljava/util/List;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String; */
} // .end method
private java.lang.String formatAccordingToFormats ( java.lang.String p0, java.util.List p1, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat p2, java.lang.String p3 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;", */
/* ">;", */
/* "Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
v1 = (( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getLeadingDigitsPatternCount ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getLeadingDigitsPatternCount()I
if ( v1 != null) { // if-eqz v1, :cond_1
v3 = this.regexCache;
/* add-int/lit8 v1, v1, -0x1 */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getLeadingDigitsPattern ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getLeadingDigitsPattern(I)Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v3 ).getPatternForRegex ( v1 ); // invoke-virtual {v3, v1}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v1 ).matcher ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v1 = (( java.util.regex.Matcher ) v1 ).lookingAt ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_1
v1 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getPattern ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getPattern()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v1 ).getPatternForRegex ( v3 ); // invoke-virtual {v1, v3}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v1 ).matcher ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getFormat ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getFormat()Ljava/lang/String;
v4 = (( java.util.regex.Matcher ) v3 ).matches ( ); // invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z
if ( v4 != null) { // if-eqz v4, :cond_0
if ( p4 != null) { // if-eqz p4, :cond_2
v2 = (( java.lang.String ) p4 ).length ( ); // invoke-virtual {p4}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_2 */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getDomesticCarrierCodeFormattingRule ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getDomesticCarrierCodeFormattingRule()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_2 */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getDomesticCarrierCodeFormattingRule ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getDomesticCarrierCodeFormattingRule()Ljava/lang/String;
v4 = com.google.i18n.phonenumbers.PhoneNumberUtil.CC_PATTERN;
(( java.util.regex.Pattern ) v4 ).matcher ( v2 ); // invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
(( java.util.regex.Matcher ) v2 ).replaceFirst ( p4 ); // invoke-virtual {v2, p4}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
v4 = com.google.i18n.phonenumbers.PhoneNumberUtil.FIRST_GROUP_PATTERN;
(( java.util.regex.Pattern ) v4 ).matcher ( v1 ); // invoke-virtual {v4, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
(( java.util.regex.Matcher ) v1 ).replaceFirst ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
} // :cond_2
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getNationalPrefixFormattingRule ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getNationalPrefixFormattingRule()Ljava/lang/String;
v2 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
/* if-ne p3, v2, :cond_4 */
if ( v0 != null) { // if-eqz v0, :cond_4
v2 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v2, :cond_4 */
v2 = com.google.i18n.phonenumbers.PhoneNumberUtil.FIRST_GROUP_PATTERN;
(( java.util.regex.Pattern ) v2 ).matcher ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
(( java.util.regex.Matcher ) v1 ).replaceFirst ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
(( java.util.regex.Matcher ) v3 ).replaceAll ( v0 ); // invoke-virtual {v3, v0}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
} // :cond_3
} // :goto_0
} // :cond_4
(( java.util.regex.Matcher ) v3 ).replaceAll ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;
} // .end method
private java.lang.String formatNationalNumber ( java.lang.String p0, java.lang.String p1, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNationalNumber(Ljava/lang/String;Ljava/lang/String;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String; */
} // .end method
private java.lang.String formatNationalNumber ( java.lang.String p0, java.lang.String p1, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat p2, java.lang.String p3 ) {
/* .locals 2 */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getIntlNumberFormatList ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getIntlNumberFormatList()Ljava/util/List;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
/* if-ne p3, v1, :cond_1 */
} // :cond_0
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getNumberFormatList ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNumberFormatList()Ljava/util/List;
} // :goto_0
/* invoke-direct {p0, p1, v0, p3, p4}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatAccordingToFormats(Ljava/lang/String;Ljava/util/List;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String; */
} // :cond_1
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getIntlNumberFormatList ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getIntlNumberFormatList()Ljava/util/List;
} // .end method
private void formatNumberByFormat ( Integer p0, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat p1, java.lang.StringBuffer p2 ) {
/* .locals 4 */
/* const/16 v3, 0x2b */
int v2 = 0; // const/4 v2, 0x0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$1.$SwitchMap$com$google$i18n$phonenumbers$PhoneNumberUtil$PhoneNumberFormat;
v1 = (( com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat ) p2 ).ordinal ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
} // :goto_0
return;
/* :pswitch_0 */
(( java.lang.StringBuffer ) p3 ).insert ( v2, p1 ); // invoke-virtual {p3, v2, p1}, Ljava/lang/StringBuffer;->insert(II)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).insert ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->insert(IC)Ljava/lang/StringBuffer;
/* :pswitch_1 */
final String v0 = " "; // const-string v0, " "
(( java.lang.StringBuffer ) p3 ).insert ( v2, v0 ); // invoke-virtual {p3, v2, v0}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).insert ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Ljava/lang/StringBuffer;->insert(II)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v0 ).insert ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuffer;->insert(IC)Ljava/lang/StringBuffer;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public static synchronized com.google.i18n.phonenumbers.PhoneNumberUtil getInstance ( ) {
/* .locals 3 */
/* const-class v1, Lcom/google/i18n/phonenumbers/PhoneNumberUtil; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.instance;
/* if-nez v0, :cond_0 */
final String v0 = "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto"; // const-string v0, "/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto"
com.google.i18n.phonenumbers.CountryCodeToRegionCodeMap .getCountryCodeToRegionCodeMap ( );
com.google.i18n.phonenumbers.PhoneNumberUtil .getInstance ( v0,v2 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit v1 */
} // :cond_0
try { // :try_start_1
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.instance;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
static synchronized com.google.i18n.phonenumbers.PhoneNumberUtil getInstance ( java.lang.String p0, java.util.Map p1 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;>;)", */
/* "Lcom/google/i18n/phonenumbers/PhoneNumberUtil;" */
/* } */
} // .end annotation
/* const-class v1, Lcom/google/i18n/phonenumbers/PhoneNumberUtil; */
/* monitor-enter v1 */
try { // :try_start_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.instance;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil; */
/* invoke-direct {v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;-><init>()V */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.instance;
this.countryCodeToRegionCodeMap = p1;
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.instance;
/* invoke-direct {v0, p0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->init(Ljava/lang/String;)V */
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.instance;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
} // .end method
public static java.lang.String getNationalSignificantNumber ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 4 */
/* new-instance v1, Ljava/lang/StringBuffer; */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).hasItalianLeadingZero ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasItalianLeadingZero()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getItalianLeadingZero ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getItalianLeadingZero()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getCountryCode ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil .isLeadingZeroCountry ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "0"; // const-string v0, "0"
} // :goto_0
/* invoke-direct {v1, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p0 ).getNationalNumber ( ); // invoke-virtual {p0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getNationalNumber()J
/* move-result-wide v2 */
(( java.lang.StringBuffer ) v1 ).append ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuffer;->append(J)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // :cond_0
final String v0 = ""; // const-string v0, ""
} // .end method
private com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType getNumberTypeHelper ( java.lang.String p0, com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata p1 ) {
/* .locals 2 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getGeneralDesc ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v1 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).hasNationalNumberPattern ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasNationalNumberPattern()Z
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
/* if-nez v0, :cond_1 */
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.UNKNOWN;
} // :goto_0
} // :cond_1
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getPremiumRate ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getPremiumRate()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.PREMIUM_RATE;
} // :cond_2
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getTollFree ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getTollFree()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.TOLL_FREE;
} // :cond_3
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getSharedCost ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getSharedCost()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.SHARED_COST;
} // :cond_4
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getVoip ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getVoip()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_5
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.VOIP;
} // :cond_5
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getPersonalNumber ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getPersonalNumber()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.PERSONAL_NUMBER;
} // :cond_6
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getPager ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getPager()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.PAGER;
} // :cond_7
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getUan ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getUan()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_8
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.UAN;
} // :cond_8
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getFixedLine ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getFixedLine()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_b
v0 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getSameMobileAndFixedLinePattern ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getSameMobileAndFixedLinePattern()Z
if ( v0 != null) { // if-eqz v0, :cond_9
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.FIXED_LINE_OR_MOBILE;
} // :cond_9
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getMobile ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getMobile()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_a
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.FIXED_LINE_OR_MOBILE;
} // :cond_a
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.FIXED_LINE;
} // :cond_b
v0 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getSameMobileAndFixedLinePattern ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getSameMobileAndFixedLinePattern()Z
/* if-nez v0, :cond_c */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getMobile ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getMobile()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = /* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v0 != null) { // if-eqz v0, :cond_c
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.MOBILE;
/* goto/16 :goto_0 */
} // :cond_c
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.UNKNOWN;
/* goto/16 :goto_0 */
} // .end method
private java.lang.String getRegionCodeForNumberFromRegionList ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, java.util.List p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getNationalNumber ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getNationalNumber()J
/* move-result-wide v0 */
java.lang.String .valueOf ( v0,v1 );
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Ljava/lang/String; */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v4 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v3 ).hasLeadingDigits ( ); // invoke-virtual {v3}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasLeadingDigits()Z
if ( v4 != null) { // if-eqz v4, :cond_1
v4 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v3 ).getLeadingDigits ( ); // invoke-virtual {v3}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getLeadingDigits()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v4 ).getPatternForRegex ( v3 ); // invoke-virtual {v4, v3}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v3 ).matcher ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v3 = (( java.util.regex.Matcher ) v3 ).lookingAt ( ); // invoke-virtual {v3}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v3 != null) { // if-eqz v3, :cond_0
} // :goto_0
} // :cond_1
/* invoke-direct {p0, v1, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getNumberTypeHelper(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType; */
v4 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.UNKNOWN;
/* if-eq v3, v4, :cond_0 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void init ( java.lang.String p0 ) {
/* .locals 3 */
this.currentFilePrefix = p1;
v0 = this.countryCodeToRegionCodeMap;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/util/List; */
v2 = this.supportedCountries;
} // :cond_0
v1 = this.nanpaCountries;
v0 = this.countryCodeToRegionCodeMap;
int v2 = 1; // const/4 v2, 0x1
java.lang.Integer .valueOf ( v2 );
/* check-cast v0, Ljava/util/Collection; */
return;
} // .end method
public static Boolean isLeadingZeroCountry ( Integer p0 ) {
/* .locals 2 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.LEADING_ZERO_COUNTRIES;
v0 = java.lang.Integer .valueOf ( p0 );
} // .end method
private Boolean isNationalNumberSuffixOfTheOther ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p1 ) {
/* .locals 3 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getNationalNumber ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getNationalNumber()J
/* move-result-wide v0 */
java.lang.String .valueOf ( v0,v1 );
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p2 ).getNationalNumber ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getNationalNumber()J
/* move-result-wide v1 */
java.lang.String .valueOf ( v1,v2 );
v2 = (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v2, :cond_0 */
v0 = (( java.lang.String ) v1 ).endsWith ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean isNumberMatchingDesc ( java.lang.String p0, com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc p1 ) {
/* .locals 3 */
v0 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) p2 ).getPossibleNumberPattern ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->getPossibleNumberPattern()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v0 ).getPatternForRegex ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v0 ).matcher ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v1 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) p2 ).getNationalNumberPattern ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->getNationalNumberPattern()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v1 ).getPatternForRegex ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v1 ).matcher ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.util.regex.Matcher ) v1 ).matches ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean isValidRegionCode ( java.lang.String p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.supportedCountries;
v0 = (( java.lang.String ) p1 ).toUpperCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
static Boolean isViablePhoneNumber ( java.lang.String p0 ) {
/* .locals 2 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
int v1 = 3; // const/4 v1, 0x3
/* if-ge v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_PHONE_NUMBER_PATTERN;
(( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
} // .end method
private void loadMetadataForRegionFromFile ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* const-class v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "_"; // const-string v2, "_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.Class ) v0 ).getResourceAsStream ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
try { // :try_start_0
/* new-instance v1, Ljava/io/ObjectInputStream; */
/* invoke-direct {v1, v0}, Ljava/io/ObjectInputStream;-><init>(Ljava/io/InputStream;)V */
/* new-instance v0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadataCollection; */
/* invoke-direct {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadataCollection;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection ) v0 ).readExternal ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadataCollection;->readExternal(Ljava/io/ObjectInput;)V
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadataCollection ) v0 ).getMetadataList ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadataCollection;->getMetadataList()Ljava/util/List;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata; */
v2 = this.countryToMetadataMap;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.LOGGER;
v2 = java.util.logging.Level.WARNING;
(( java.io.IOException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
(( java.util.logging.Logger ) v1 ).log ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
} // :cond_0
return;
} // .end method
private void maybeGetFormattedExtension ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, java.lang.String p1, java.lang.StringBuffer p2 ) {
/* .locals 2 */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasExtension ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v1 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).hasPreferredExtnPrefix ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredExtnPrefix()Z
if ( v1 != null) { // if-eqz v1, :cond_1
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getPreferredExtnPrefix ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getPreferredExtnPrefix()Ljava/lang/String;
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :goto_0
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getExtension ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_0
return;
} // :cond_1
final String v0 = " ext."; // const-string v0, " ext."
(( java.lang.StringBuffer ) p3 ).append ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // .end method
static java.lang.String normalize ( java.lang.String p0 ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.VALID_ALPHA_PHONE_PATTERN;
(( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.ALL_NORMALIZATION_MAPPINGS;
com.google.i18n.phonenumbers.PhoneNumberUtil .normalizeHelper ( p0,v0,v1 );
} // :goto_0
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.DIGIT_MAPPINGS;
com.google.i18n.phonenumbers.PhoneNumberUtil .normalizeHelper ( p0,v0,v1 );
} // .end method
static void normalize ( java.lang.StringBuffer p0 ) {
/* .locals 3 */
(( java.lang.StringBuffer ) p0 ).toString ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
com.google.i18n.phonenumbers.PhoneNumberUtil .normalize ( v0 );
int v1 = 0; // const/4 v1, 0x0
v2 = (( java.lang.StringBuffer ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/StringBuffer;->length()I
(( java.lang.StringBuffer ) p0 ).replace ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Ljava/lang/StringBuffer;->replace(IILjava/lang/String;)Ljava/lang/StringBuffer;
return;
} // .end method
public static java.lang.String normalizeDigitsOnly ( java.lang.String p0 ) {
/* .locals 2 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.DIGIT_MAPPINGS;
int v1 = 1; // const/4 v1, 0x1
com.google.i18n.phonenumbers.PhoneNumberUtil .normalizeHelper ( p0,v0,v1 );
} // .end method
private static java.lang.String normalizeHelper ( java.lang.String p0, java.util.Map p1, Boolean p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Character;", */
/* "Ljava/lang/Character;", */
/* ">;Z)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* new-instance v2, Ljava/lang/StringBuffer; */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* invoke-direct {v2, v0}, Ljava/lang/StringBuffer;-><init>(I)V */
(( java.lang.String ) p0 ).toCharArray ( ); // invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C
/* array-length v4, v3 */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
} // :goto_0
/* if-ge v1, v4, :cond_2 */
/* aget-char v5, v3, v1 */
v0 = java.lang.Character .toUpperCase ( v5 );
java.lang.Character .valueOf ( v0 );
/* check-cast v0, Ljava/lang/Character; */
if ( v0 != null) { // if-eqz v0, :cond_1
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/Object;)Ljava/lang/StringBuffer;
} // :cond_0
} // :goto_1
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // :cond_1
/* if-nez p2, :cond_0 */
(( java.lang.StringBuffer ) v2 ).append ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
} // :cond_2
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
private void parseHelper ( java.lang.String p0, java.lang.String p1, Boolean p2, Boolean p3, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p4 ) {
/* .locals 8 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/i18n/phonenumbers/NumberParseException; */
/* } */
} // .end annotation
int v7 = 3; // const/4 v7, 0x3
/* if-nez p1, :cond_0 */
/* new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException; */
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.NOT_A_NUMBER;
final String v2 = "The phone number supplied was null."; // const-string v2, "The phone number supplied was null."
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException;-><init>(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
com.google.i18n.phonenumbers.PhoneNumberUtil .extractPossibleNumber ( p1 );
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil .isViablePhoneNumber ( v0 );
/* if-nez v1, :cond_1 */
/* new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException; */
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.NOT_A_NUMBER;
final String v2 = "The string supplied did not seem to be a phone number."; // const-string v2, "The string supplied did not seem to be a phone number."
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException;-><init>(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_1
if ( p4 != null) { // if-eqz p4, :cond_2
v1 = /* invoke-direct {p0, v0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->checkRegionForParsing(Ljava/lang/String;Ljava/lang/String;)Z */
/* if-nez v1, :cond_2 */
/* new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException; */
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.INVALID_COUNTRY_CODE;
final String v2 = "Missing or invalid default country."; // const-string v2, "Missing or invalid default country."
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException;-><init>(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_2
if ( p3 != null) { // if-eqz p3, :cond_3
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setRawInput ( p1 ); // invoke-virtual {p5, p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setRawInput(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_3
/* new-instance v6, Ljava/lang/StringBuffer; */
/* invoke-direct {v6, v0}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).maybeStripExtension ( v6 ); // invoke-virtual {p0, v6}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeStripExtension(Ljava/lang/StringBuffer;)Ljava/lang/String;
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_4 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setExtension ( v0 ); // invoke-virtual {p5, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setExtension(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_4
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
/* new-instance v3, Ljava/lang/StringBuffer; */
/* invoke-direct {v3}, Ljava/lang/StringBuffer;-><init>()V */
(( java.lang.StringBuffer ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* move-object v0, p0 */
/* move v4, p3 */
/* move-object v5, p5 */
v0 = /* invoke-virtual/range {v0 ..v5}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeExtractCountryCode(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;Ljava/lang/StringBuffer;ZLcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)I */
if ( v0 != null) { // if-eqz v0, :cond_6
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForCountryCode ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;
v4 = (( java.lang.String ) v1 ).equals ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_5 */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
} // :cond_5
} // :goto_0
v1 = (( java.lang.StringBuffer ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->length()I
/* if-ge v1, v7, :cond_8 */
/* new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException; */
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.TOO_SHORT_NSN;
final String v2 = "The string supplied is too short to be a phone number."; // const-string v2, "The string supplied is too short to be a phone number."
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException;-><init>(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_6
com.google.i18n.phonenumbers.PhoneNumberUtil .normalize ( v6 );
(( java.lang.StringBuffer ) v3 ).append ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
if ( p2 != null) { // if-eqz p2, :cond_7
v0 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v2 ).getCountryCode ( ); // invoke-virtual {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getCountryCode()I
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setCountryCode ( v0 ); // invoke-virtual {p5, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCode(I)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_7
if ( p3 != null) { // if-eqz p3, :cond_5
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).clearCountryCodeSource ( ); // invoke-virtual {p5}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearCountryCodeSource()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_8
if ( v2 != null) { // if-eqz v2, :cond_9
v1 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v2 ).getGeneralDesc ( ); // invoke-virtual {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v4 ).getNationalNumberPattern ( ); // invoke-virtual {v4}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->getNationalNumberPattern()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v1 ).getPatternForRegex ( v4 ); // invoke-virtual {v1, v4}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v2 ).getNationalPrefixForParsing ( ); // invoke-virtual {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNationalPrefixForParsing()Ljava/lang/String;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v2 ).getNationalPrefixTransformRule ( ); // invoke-virtual {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNationalPrefixTransformRule()Ljava/lang/String;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).maybeStripNationalPrefix ( v3, v4, v2, v1 ); // invoke-virtual {p0, v3, v4, v2, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeStripNationalPrefix(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/util/regex/Pattern;)V
} // :cond_9
v1 = (( java.lang.StringBuffer ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->length()I
/* if-ge v1, v7, :cond_a */
/* new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException; */
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.TOO_SHORT_NSN;
final String v2 = "The string supplied is too short to be a phone number."; // const-string v2, "The string supplied is too short to be a phone number."
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException;-><init>(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_a
/* const/16 v2, 0xf */
/* if-le v1, v2, :cond_b */
/* new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException; */
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.TOO_LONG;
final String v2 = "The string supplied is too long to be a phone number."; // const-string v2, "The string supplied is too long to be a phone number."
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException;-><init>(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_b
int v1 = 0; // const/4 v1, 0x0
v1 = (( java.lang.StringBuffer ) v3 ).charAt ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuffer;->charAt(I)C
/* const/16 v2, 0x30 */
/* if-ne v1, v2, :cond_c */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil .isLeadingZeroCountry ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_c
int v0 = 1; // const/4 v0, 0x1
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setItalianLeadingZero ( v0 ); // invoke-virtual {p5, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setItalianLeadingZero(Z)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_c
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
java.lang.Long .parseLong ( v0 );
/* move-result-wide v0 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setNationalNumber ( v0, v1 ); // invoke-virtual {p5, v0, v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setNationalNumber(J)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
return;
} // .end method
private Boolean parsePrefixAsIdd ( java.util.regex.Pattern p0, java.lang.StringBuffer p1 ) {
/* .locals 5 */
int v1 = 1; // const/4 v1, 0x1
int v0 = 0; // const/4 v0, 0x0
(( java.util.regex.Pattern ) p1 ).matcher ( p2 ); // invoke-virtual {p1, p2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v3 = (( java.util.regex.Matcher ) v2 ).lookingAt ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v3 != null) { // if-eqz v3, :cond_0
v2 = (( java.util.regex.Matcher ) v2 ).end ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I
v3 = com.google.i18n.phonenumbers.PhoneNumberUtil.CAPTURING_DIGIT_PATTERN;
(( java.lang.StringBuffer ) p2 ).substring ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/StringBuffer;->substring(I)Ljava/lang/String;
(( java.util.regex.Pattern ) v3 ).matcher ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v4 = (( java.util.regex.Matcher ) v3 ).find ( ); // invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z
if ( v4 != null) { // if-eqz v4, :cond_1
(( java.util.regex.Matcher ) v3 ).group ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
v4 = com.google.i18n.phonenumbers.PhoneNumberUtil.DIGIT_MAPPINGS;
com.google.i18n.phonenumbers.PhoneNumberUtil .normalizeHelper ( v3,v4,v1 );
final String v4 = "0"; // const-string v4, "0"
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_1
} // :cond_0
} // :goto_0
} // :cond_1
(( java.lang.StringBuffer ) p2 ).delete ( v0, v2 ); // invoke-virtual {p2, v0, v2}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
/* move v0, v1 */
} // .end method
static synchronized void resetInstance ( ) {
/* .locals 2 */
/* const-class v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil; */
/* monitor-enter v0 */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit v0 */
return;
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit v0 */
/* throw v1 */
} // .end method
/* # virtual methods */
Boolean canBeInternationallyDialled ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 4 */
int v0 = 1; // const/4 v0, 0x1
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Ljava/lang/String;
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
v3 = /* invoke-direct {p0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v3, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v1 ).getNoInternationalDialling ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNoInternationalDialling()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v1 = /* invoke-direct {p0, v2, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatchingDesc(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;)Z */
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
Integer extractCountryCode ( java.lang.StringBuffer p0, java.lang.StringBuffer p1 ) {
/* .locals 6 */
int v1 = 0; // const/4 v1, 0x0
v3 = (( java.lang.StringBuffer ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I
int v0 = 1; // const/4 v0, 0x1
/* move v2, v0 */
} // :goto_0
int v0 = 3; // const/4 v0, 0x3
/* if-gt v2, v0, :cond_1 */
/* if-gt v2, v3, :cond_1 */
(( java.lang.StringBuffer ) p1 ).substring ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;
v0 = java.lang.Integer .parseInt ( v0 );
v4 = this.countryCodeToRegionCodeMap;
v4 = java.lang.Integer .valueOf ( v0 );
if ( v4 != null) { // if-eqz v4, :cond_0
(( java.lang.StringBuffer ) p1 ).substring ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/StringBuffer;->substring(I)Ljava/lang/String;
(( java.lang.StringBuffer ) p2 ).append ( v1 ); // invoke-virtual {p2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :goto_1
} // :cond_0
/* add-int/lit8 v0, v2, 0x1 */
/* move v2, v0 */
} // :cond_1
/* move v0, v1 */
} // .end method
public java.lang.String format ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat p1 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* const/16 v1, 0x14 */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(I)V */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuffer;)V
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public void format ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat p1, java.lang.StringBuffer p2 ) {
/* .locals 4 */
int v0 = 0; // const/4 v0, 0x0
(( java.lang.StringBuffer ) p3 ).setLength ( v0 ); // invoke-virtual {p3, v0}, Ljava/lang/StringBuffer;->setLength(I)V
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
v2 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.E164;
/* if-ne p2, v2, :cond_0 */
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.E164;
/* invoke-direct {p0, v0, v1, p3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNumberByFormat(ILcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuffer;)V */
} // :goto_0
return;
} // :cond_0
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForCountryCode ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;
v3 = /* invoke-direct {p0, v2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v3, :cond_1 */
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
} // :cond_1
/* invoke-direct {p0, v1, v2, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNationalNumber(Ljava/lang/String;Ljava/lang/String;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String; */
(( java.lang.StringBuffer ) p3 ).append ( v1 ); // invoke-virtual {p3, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* invoke-direct {p0, p1, v2, p3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeGetFormattedExtension(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;Ljava/lang/StringBuffer;)V */
/* invoke-direct {p0, v0, p2, p3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNumberByFormat(ILcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuffer;)V */
} // .end method
public java.lang.String formatByPattern ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat p1, java.util.List p2 ) {
/* .locals 9 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;", */
/* "Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;", */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForCountryCode ( v2 ); // invoke-virtual {p0, v2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;
v0 = /* invoke-direct {p0, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v0, :cond_0 */
/* move-object v0, v1 */
} // :goto_0
} // :cond_0
v0 = /* new-instance v4, Ljava/util/ArrayList; */
/* invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(I)V */
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v0 ).getNationalPrefixFormattingRule ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->getNationalPrefixFormattingRule()Ljava/lang/String;
v7 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
/* if-lez v7, :cond_2 */
/* new-instance v7, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat; */
/* invoke-direct {v7}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;-><init>()V */
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v7 ).mergeFrom ( v0 ); // invoke-virtual {v7, v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->mergeFrom(Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;)Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( v3 ); // invoke-virtual {p0, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getNationalPrefix ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNationalPrefix()Ljava/lang/String;
v8 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v8, :cond_1 */
v8 = com.google.i18n.phonenumbers.PhoneNumberUtil.NP_PATTERN;
(( java.util.regex.Pattern ) v8 ).matcher ( v6 ); // invoke-virtual {v8, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
(( java.util.regex.Matcher ) v6 ).replaceFirst ( v0 ); // invoke-virtual {v6, v0}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
v6 = com.google.i18n.phonenumbers.PhoneNumberUtil.FG_PATTERN;
(( java.util.regex.Pattern ) v6 ).matcher ( v0 ); // invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
final String v6 = "\\$1"; // const-string v6, "\\$1"
(( java.util.regex.Matcher ) v0 ).replaceFirst ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v7 ).setNationalPrefixFormattingRule ( v0 ); // invoke-virtual {v7, v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->setNationalPrefixFormattingRule(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;
} // :goto_2
} // :cond_1
(( com.google.i18n.phonenumbers.Phonemetadata$NumberFormat ) v7 ).clearNationalPrefixFormattingRule ( ); // invoke-virtual {v7}, Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;->clearNationalPrefixFormattingRule()Lcom/google/i18n/phonenumbers/Phonemetadata$NumberFormat;
} // :cond_2
} // :cond_3
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {p0, v1, v4, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatAccordingToFormats(Ljava/lang/String;Ljava/util/List;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String; */
/* invoke-direct {v0, v1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* invoke-direct {p0, p1, v3, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeGetFormattedExtension(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;Ljava/lang/StringBuffer;)V */
/* invoke-direct {p0, v2, p2, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNumberByFormat(ILcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuffer;)V */
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public java.lang.String formatInOriginalFormat ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, java.lang.String p1 ) {
/* .locals 2 */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasCountryCodeSource ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasCountryCodeSource()Z
/* if-nez v0, :cond_0 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
} // :goto_0
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$1.$SwitchMap$com$google$i18n$phonenumbers$Phonenumber$PhoneNumber$CountryCodeSource;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCodeSource ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCodeSource()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;
v1 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
/* :pswitch_0 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
/* :pswitch_1 */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).formatOutOfCountryCallingNumber ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatOutOfCountryCallingNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;)Ljava/lang/String;
/* :pswitch_2 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
int v1 = 1; // const/4 v1, 0x1
(( java.lang.String ) v0 ).substring ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public java.lang.String formatNationalNumberWithCarrierCode ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, java.lang.String p1 ) {
/* .locals 5 */
v1 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForCountryCode ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;
v3 = /* invoke-direct {p0, v2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v3, :cond_0 */
} // :goto_0
} // :cond_0
/* new-instance v3, Ljava/lang/StringBuffer; */
/* const/16 v4, 0x14 */
/* invoke-direct {v3, v4}, Ljava/lang/StringBuffer;-><init>(I)V */
v4 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
/* invoke-direct {p0, v0, v2, v4, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNationalNumber(Ljava/lang/String;Ljava/lang/String;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/String;)Ljava/lang/String; */
(( java.lang.StringBuffer ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* invoke-direct {p0, p1, v2, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeGetFormattedExtension(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;Ljava/lang/StringBuffer;)V */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
/* invoke-direct {p0, v1, v0, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNumberByFormat(ILcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuffer;)V */
(( java.lang.StringBuffer ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
} // .end method
public java.lang.String formatOutOfCountryCallingNumber ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, java.lang.String p1 ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
v0 = /* invoke-direct {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v0, :cond_1 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
} // :cond_0
} // :goto_0
} // :cond_1
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForCountryCode ( v2 ); // invoke-virtual {p0, v2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
v1 = /* invoke-direct {p0, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
if ( v1 != null) { // if-eqz v1, :cond_0
int v1 = 1; // const/4 v1, 0x1
/* if-ne v2, v1, :cond_2 */
v1 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isNANPACountry ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNANPACountry(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " "; // const-string v1, " "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( p1, v1 ); // invoke-virtual {p0, p1, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
v1 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getCountryCodeForRegion ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getCountryCodeForRegion(Ljava/lang/String;)I
/* if-ne v2, v1, :cond_3 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.NATIONAL;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
} // :cond_3
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL;
/* invoke-direct {p0, v0, v3, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNationalNumber(Ljava/lang/String;Ljava/lang/String;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String; */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v5 ).getInternationalPrefix ( ); // invoke-virtual {v5}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getInternationalPrefix()Ljava/lang/String;
final String v1 = ""; // const-string v1, ""
v6 = com.google.i18n.phonenumbers.PhoneNumberUtil.UNIQUE_INTERNATIONAL_PREFIX;
(( java.util.regex.Pattern ) v6 ).matcher ( v0 ); // invoke-virtual {v6, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v6 = (( java.util.regex.Matcher ) v6 ).matches ( ); // invoke-virtual {v6}, Ljava/util/regex/Matcher;->matches()Z
if ( v6 != null) { // if-eqz v6, :cond_4
} // :goto_1
/* new-instance v1, Ljava/lang/StringBuffer; */
/* invoke-direct {v1, v4}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
/* invoke-direct {p0, p1, v3, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeGetFormattedExtension(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;Ljava/lang/StringBuffer;)V */
v3 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v3, :cond_5 */
final String v3 = " "; // const-string v3, " "
(( java.lang.StringBuffer ) v1 ).insert ( v7, v3 ); // invoke-virtual {v1, v7, v3}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v3 ).insert ( v7, v2 ); // invoke-virtual {v3, v7, v2}, Ljava/lang/StringBuffer;->insert(II)Ljava/lang/StringBuffer;
final String v3 = " "; // const-string v3, " "
(( java.lang.StringBuffer ) v2 ).insert ( v7, v3 ); // invoke-virtual {v2, v7, v3}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).insert ( v7, v0 ); // invoke-virtual {v2, v7, v0}, Ljava/lang/StringBuffer;->insert(ILjava/lang/String;)Ljava/lang/StringBuffer;
} // :goto_2
(( java.lang.StringBuffer ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* goto/16 :goto_0 */
} // :cond_4
v0 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v5 ).hasPreferredInternationalPrefix ( ); // invoke-virtual {v5}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasPreferredInternationalPrefix()Z
if ( v0 != null) { // if-eqz v0, :cond_6
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v5 ).getPreferredInternationalPrefix ( ); // invoke-virtual {v5}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getPreferredInternationalPrefix()Ljava/lang/String;
} // :cond_5
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL;
/* invoke-direct {p0, v2, v0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->formatNumberByFormat(ILcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;Ljava/lang/StringBuffer;)V */
} // :cond_6
/* move-object v0, v1 */
} // .end method
public com.google.i18n.phonenumbers.AsYouTypeFormatter getAsYouTypeFormatter ( java.lang.String p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter; */
/* invoke-direct {v0, p1}, Lcom/google/i18n/phonenumbers/AsYouTypeFormatter;-><init>(Ljava/lang/String;)V */
} // .end method
public Integer getCountryCodeForRegion ( java.lang.String p0 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
v1 = /* invoke-direct {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v1, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v1 ).getCountryCode ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getCountryCode()I
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber getExampleNumber ( java.lang.String p0 ) {
/* .locals 1 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.FIXED_LINE;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getExampleNumberForType ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getExampleNumberForType(Ljava/lang/String;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber getExampleNumberForType ( java.lang.String p0, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType p1 ) {
/* .locals 3 */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getNumberDescByType ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getNumberDescByType(Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
try { // :try_start_0
v1 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).hasExampleNumber ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasExampleNumber()Z
if ( v1 != null) { // if-eqz v1, :cond_0
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).getExampleNumber ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->getExampleNumber()Ljava/lang/String;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).parse ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
/* :try_end_0 */
/* .catch Lcom/google/i18n/phonenumbers/NumberParseException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.LOGGER;
v2 = java.util.logging.Level.SEVERE;
(( com.google.i18n.phonenumbers.NumberParseException ) v0 ).toString ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/NumberParseException;->toString()Ljava/lang/String;
(( java.util.logging.Logger ) v1 ).log ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getLengthOfGeographicalAreaCode ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Ljava/lang/String;
v2 = /* invoke-direct {p0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v2, :cond_1 */
} // :cond_0
} // :goto_0
} // :cond_1
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( v1 ); // invoke-virtual {p0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
v2 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v1 ).hasNationalPrefix ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->hasNationalPrefix()Z
if ( v2 != null) { // if-eqz v2, :cond_0
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
/* invoke-direct {p0, v2, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getNumberTypeHelper(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType; */
v2 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.FIXED_LINE;
/* if-eq v1, v2, :cond_2 */
v2 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.FIXED_LINE_OR_MOBILE;
/* if-ne v1, v2, :cond_0 */
} // :cond_2
v0 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getLengthOfNationalDestinationCode ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getLengthOfNationalDestinationCode(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)I
} // .end method
public Integer getLengthOfNationalDestinationCode ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 4 */
int v3 = 3; // const/4 v3, 0x3
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).hasExtension ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).mergeFrom ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->mergeFrom(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).clearExtension ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearExtension()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :goto_0
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.INTERNATIONAL;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).format ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil.NON_DIGITS_PATTERN;
(( java.util.regex.Pattern ) v1 ).split ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;
/* array-length v1, v0 */
/* if-gt v1, v3, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
} // :cond_0
/* move-object v0, p1 */
} // :cond_1
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Ljava/lang/String;
final String v2 = "AR"; // const-string v2, "AR"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getNumberType ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getNumberType(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType;
v2 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.MOBILE;
/* if-ne v1, v2, :cond_2 */
/* aget-object v0, v0, v3 */
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_2
int v1 = 2; // const/4 v1, 0x2
/* aget-object v0, v0, v1 */
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
} // .end method
com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata getMetadataForRegion ( java.lang.String p0 ) {
/* .locals 2 */
v0 = /* invoke-direct {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
(( java.lang.String ) p1 ).toUpperCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
v1 = v1 = this.countryToMetadataMap;
/* if-nez v1, :cond_1 */
v1 = this.currentFilePrefix;
/* invoke-direct {p0, v1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->loadMetadataForRegionFromFile(Ljava/lang/String;Ljava/lang/String;)V */
} // :cond_1
v1 = this.countryToMetadataMap;
/* check-cast v0, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata; */
} // .end method
public java.lang.String getNddPrefixForRegion ( java.lang.String p0, Boolean p1 ) {
/* .locals 4 */
int v1 = 0; // const/4 v1, 0x0
v0 = /* invoke-direct {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v0, :cond_1 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.LOGGER;
v2 = java.util.logging.Level.SEVERE;
final String v3 = "Invalid or missing country code provided."; // const-string v3, "Invalid or missing country code provided."
(( java.util.logging.Logger ) v0 ).log ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
/* move-object v0, v1 */
} // :cond_0
} // :goto_0
} // :cond_1
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
/* if-nez v0, :cond_2 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.LOGGER;
v2 = java.util.logging.Level.SEVERE;
final String v3 = "Unsupported country code provided."; // const-string v3, "Unsupported country code provided."
(( java.util.logging.Logger ) v0 ).log ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
/* move-object v0, v1 */
} // :cond_2
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getNationalPrefix ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNationalPrefix()Ljava/lang/String;
v2 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-nez v2, :cond_3 */
/* move-object v0, v1 */
} // :cond_3
if ( p2 != null) { // if-eqz p2, :cond_0
final String v1 = "~"; // const-string v1, "~"
final String v2 = ""; // const-string v2, ""
(( java.lang.String ) v0 ).replace ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
} // .end method
com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc getNumberDescByType ( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata p0, com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType p1 ) {
/* .locals 2 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$1.$SwitchMap$com$google$i18n$phonenumbers$PhoneNumberUtil$PhoneNumberType;
v1 = (( com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType ) p2 ).ordinal ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getGeneralDesc ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
} // :goto_0
/* :pswitch_0 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getPremiumRate ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getPremiumRate()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* :pswitch_1 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getTollFree ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getTollFree()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* :pswitch_2 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getMobile ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getMobile()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* :pswitch_3 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getFixedLine ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getFixedLine()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* :pswitch_4 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getSharedCost ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getSharedCost()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* :pswitch_5 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getVoip ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getVoip()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* :pswitch_6 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getPersonalNumber ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getPersonalNumber()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* :pswitch_7 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getPager ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getPager()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* :pswitch_8 */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p1 ).getUan ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getUan()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_6 */
/* :pswitch_7 */
/* :pswitch_8 */
} // .end packed-switch
} // .end method
public com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType getNumberType ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 2 */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Ljava/lang/String;
v1 = /* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v1, :cond_0 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.UNKNOWN;
} // :goto_0
} // :cond_0
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
/* invoke-direct {p0, v1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getNumberTypeHelper(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType; */
} // .end method
public java.lang.String getRegionCodeForCountryCode ( Integer p0 ) {
/* .locals 2 */
v0 = this.countryCodeToRegionCodeMap;
java.lang.Integer .valueOf ( p1 );
/* check-cast v0, Ljava/util/List; */
/* if-nez v0, :cond_0 */
final String v0 = "ZZ"; // const-string v0, "ZZ"
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Ljava/lang/String; */
} // .end method
public java.lang.String getRegionCodeForNumber ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 3 */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
v1 = this.countryCodeToRegionCodeMap;
java.lang.Integer .valueOf ( v0 );
/* check-cast v0, Ljava/util/List; */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = } // :cond_0
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Ljava/lang/String; */
} // :cond_1
/* invoke-direct {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForNumberFromRegionList(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/util/List;)Ljava/lang/String; */
} // .end method
public java.util.Set getSupportedCountries ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
v0 = this.supportedCountries;
} // .end method
public Boolean isNANPACountry ( java.lang.String p0 ) {
/* .locals 2 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.nanpaCountries;
v0 = (( java.lang.String ) p1 ).toUpperCase ( ); // invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType isNumberMatch ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p1 ) {
/* .locals 5 */
/* new-instance v0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).mergeFrom ( p1 ); // invoke-virtual {v0, p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->mergeFrom(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
/* new-instance v1, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).mergeFrom ( p2 ); // invoke-virtual {v1, p2}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->mergeFrom(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).clearRawInput ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearRawInput()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).clearCountryCodeSource ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearCountryCodeSource()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).clearRawInput ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearRawInput()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).clearCountryCodeSource ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearCountryCodeSource()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).hasExtension ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension()Z
if ( v2 != null) { // if-eqz v2, :cond_0
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).getExtension ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-nez v2, :cond_0 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).clearExtension ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearExtension()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_0
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).hasExtension ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension()Z
if ( v2 != null) { // if-eqz v2, :cond_1
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).getExtension ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
/* if-nez v2, :cond_1 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).clearExtension ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->clearExtension()Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_1
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).hasExtension ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension()Z
if ( v2 != null) { // if-eqz v2, :cond_2
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).hasExtension ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->hasExtension()Z
if ( v2 != null) { // if-eqz v2, :cond_2
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).getExtension ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).getExtension ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getExtension()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_2 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.NO_MATCH;
} // :goto_0
} // :cond_2
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).getCountryCode ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
v3 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v1 ).getCountryCode ( ); // invoke-virtual {v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
if ( v2 != null) { // if-eqz v2, :cond_5
if ( v3 != null) { // if-eqz v3, :cond_5
v4 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).exactlySameAs ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->exactlySameAs(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.EXACT_MATCH;
} // :cond_3
/* if-ne v2, v3, :cond_4 */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNationalNumberSuffixOfTheOther(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z */
if ( v0 != null) { // if-eqz v0, :cond_4
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.SHORT_NSN_MATCH;
} // :cond_4
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.NO_MATCH;
} // :cond_5
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).setCountryCode ( v3 ); // invoke-virtual {v0, v3}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCode(I)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v0 ).exactlySameAs ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->exactlySameAs(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.NSN_MATCH;
} // :cond_6
v0 = /* invoke-direct {p0, v0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNationalNumberSuffixOfTheOther(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z */
if ( v0 != null) { // if-eqz v0, :cond_7
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.SHORT_NSN_MATCH;
} // :cond_7
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.NO_MATCH;
} // .end method
public com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType isNumberMatch ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, java.lang.String p1 ) {
/* .locals 6 */
try { // :try_start_0
final String v0 = "ZZ"; // const-string v0, "ZZ"
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).parse ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isNumberMatch ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatch(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$MatchType;
/* :try_end_0 */
/* .catch Lcom/google/i18n/phonenumbers/NumberParseException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
(( com.google.i18n.phonenumbers.NumberParseException ) v0 ).getErrorType ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/NumberParseException;->getErrorType()Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.INVALID_COUNTRY_CODE;
/* if-ne v0, v1, :cond_2 */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForCountryCode ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;
try { // :try_start_1
final String v1 = "ZZ"; // const-string v1, "ZZ"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).parse ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isNumberMatch ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatch(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$MatchType;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.EXACT_MATCH;
/* if-ne v0, v1, :cond_0 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.NSN_MATCH;
} // :cond_1
/* new-instance v5, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v5}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move-object v1, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)V */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isNumberMatch ( p1, v5 ); // invoke-virtual {p0, p1, v5}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatch(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$MatchType;
/* :try_end_1 */
/* .catch Lcom/google/i18n/phonenumbers/NumberParseException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
} // :cond_2
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.NOT_A_NUMBER;
} // .end method
public com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType isNumberMatch ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 12 */
try { // :try_start_0
final String v0 = "ZZ"; // const-string v0, "ZZ"
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).parse ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isNumberMatch ( v0, p2 ); // invoke-virtual {p0, v0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatch(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$MatchType;
/* :try_end_0 */
/* .catch Lcom/google/i18n/phonenumbers/NumberParseException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
(( com.google.i18n.phonenumbers.NumberParseException ) v0 ).getErrorType ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/NumberParseException;->getErrorType()Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.INVALID_COUNTRY_CODE;
/* if-ne v0, v1, :cond_0 */
try { // :try_start_1
final String v0 = "ZZ"; // const-string v0, "ZZ"
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).parse ( p2, v0 ); // invoke-virtual {p0, p2, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isNumberMatch ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatch(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$MatchType;
/* :try_end_1 */
/* .catch Lcom/google/i18n/phonenumbers/NumberParseException; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
(( com.google.i18n.phonenumbers.NumberParseException ) v0 ).getErrorType ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/NumberParseException;->getErrorType()Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.INVALID_COUNTRY_CODE;
/* if-ne v0, v1, :cond_0 */
try { // :try_start_2
/* new-instance v5, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v5}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
/* new-instance v11, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v11}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)V */
int v8 = 0; // const/4 v8, 0x0
int v9 = 0; // const/4 v9, 0x0
int v10 = 0; // const/4 v10, 0x0
/* move-object v6, p0 */
/* move-object v7, p2 */
/* invoke-direct/range {v6 ..v11}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)V */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isNumberMatch ( v5, v11 ); // invoke-virtual {p0, v5, v11}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isNumberMatch(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$MatchType;
/* :try_end_2 */
/* .catch Lcom/google/i18n/phonenumbers/NumberParseException; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
/* move-exception v0 */
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$MatchType.NOT_A_NUMBER;
} // .end method
public Boolean isPossibleNumber ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 2 */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isPossibleNumberWithReason ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isPossibleNumberWithReason(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.IS_POSSIBLE;
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isPossibleNumber ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
try { // :try_start_0
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).parse ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isPossibleNumber ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isPossibleNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z
/* :try_end_0 */
v0 = /* .catch Lcom/google/i18n/phonenumbers/NumberParseException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult isPossibleNumberWithReason ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 4 */
v0 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForCountryCode ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForCountryCode(I)Ljava/lang/String;
v1 = /* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
/* if-nez v1, :cond_0 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.INVALID_COUNTRY_CODE;
} // :goto_0
} // :cond_0
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v0 ).getGeneralDesc ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v2 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).hasNationalNumberPattern ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasNationalNumberPattern()Z
/* if-nez v2, :cond_3 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.LOGGER;
v2 = java.util.logging.Level.FINER;
final String v3 = "Checking if number is possible with incomplete metadata."; // const-string v3, "Checking if number is possible with incomplete metadata."
(( java.util.logging.Logger ) v0 ).log ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V
v0 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
int v1 = 3; // const/4 v1, 0x3
/* if-ge v0, v1, :cond_1 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.TOO_SHORT;
} // :cond_1
/* const/16 v1, 0xf */
/* if-le v0, v1, :cond_2 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.TOO_LONG;
} // :cond_2
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.IS_POSSIBLE;
} // :cond_3
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v0 ).getPossibleNumberPattern ( ); // invoke-virtual {v0}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->getPossibleNumberPattern()Ljava/lang/String;
v2 = this.regexCache;
(( com.google.i18n.phonenumbers.RegexCache ) v2 ).getPatternForRegex ( v0 ); // invoke-virtual {v2, v0}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v0 ).matcher ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v2 = (( java.util.regex.Matcher ) v0 ).lookingAt ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v2 != null) { // if-eqz v2, :cond_5
v0 = (( java.util.regex.Matcher ) v0 ).end ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I
v1 = (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
/* if-ne v0, v1, :cond_4 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.IS_POSSIBLE;
} // :cond_4
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.TOO_LONG;
} // :cond_5
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.TOO_SHORT;
} // .end method
public Boolean isValidNumber ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 2 */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getRegionCodeForNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getRegionCodeForNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Ljava/lang/String;
v1 = /* invoke-direct {p0, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidRegionCode(Ljava/lang/String;)Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isValidNumberForRegion ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidNumberForRegion(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isValidNumberForRegion ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0, java.lang.String p1 ) {
/* .locals 5 */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
v2 = (( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getCountryCode ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getCountryCode()I
v3 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getCountryCodeForRegion ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getCountryCodeForRegion(Ljava/lang/String;)I
/* if-eq v2, v3, :cond_1 */
/* move v0, v1 */
} // :cond_0
} // :goto_0
} // :cond_1
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).getMetadataForRegion ( p2 ); // invoke-virtual {p0, p2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getMetadataForRegion(Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) v2 ).getGeneralDesc ( ); // invoke-virtual {v2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
com.google.i18n.phonenumbers.PhoneNumberUtil .getNationalSignificantNumber ( p1 );
v3 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v3 ).hasNationalNumberPattern ( ); // invoke-virtual {v3}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->hasNationalNumberPattern()Z
/* if-nez v3, :cond_3 */
v2 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
int v3 = 3; // const/4 v3, 0x3
/* if-le v2, v3, :cond_2 */
/* const/16 v3, 0xf */
/* if-le v2, v3, :cond_0 */
} // :cond_2
/* move v0, v1 */
} // :cond_3
/* invoke-direct {p0, v4, v2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->getNumberTypeHelper(Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberType; */
v3 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberType.UNKNOWN;
/* if-ne v2, v3, :cond_0 */
/* move v0, v1 */
} // .end method
Integer maybeExtractCountryCode ( java.lang.String p0, com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata p1, java.lang.StringBuffer p2, Boolean p3, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p4 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/i18n/phonenumbers/NumberParseException; */
/* } */
} // .end annotation
int v1 = 0; // const/4 v1, 0x0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
final String v0 = "NonMatch"; // const-string v0, "NonMatch"
if ( p2 != null) { // if-eqz p2, :cond_1
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getInternationalPrefix ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getInternationalPrefix()Ljava/lang/String;
} // :cond_1
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).maybeStripInternationalPrefixAndNormalize ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeStripInternationalPrefixAndNormalize(Ljava/lang/StringBuffer;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;
if ( p4 != null) { // if-eqz p4, :cond_2
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setCountryCodeSource ( v0 ); // invoke-virtual {p5, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCodeSource(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_2
v3 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_DEFAULT_COUNTRY;
/* if-eq v0, v3, :cond_5 */
v0 = (( java.lang.StringBuffer ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->length()I
int v1 = 3; // const/4 v1, 0x3
/* if-ge v0, v1, :cond_3 */
/* new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException; */
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.TOO_SHORT_AFTER_IDD;
final String v2 = "Phone number had an IDD, but after this was not long enough to be a viable phone number."; // const-string v2, "Phone number had an IDD, but after this was not long enough to be a viable phone number."
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException;-><init>(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_3
v0 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).extractCountryCode ( v2, p3 ); // invoke-virtual {p0, v2, p3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->extractCountryCode(Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;)I
if ( v0 != null) { // if-eqz v0, :cond_4
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setCountryCode ( v0 ); // invoke-virtual {p5, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCode(I)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_4
/* new-instance v0, Lcom/google/i18n/phonenumbers/NumberParseException; */
v1 = com.google.i18n.phonenumbers.NumberParseException$ErrorType.INVALID_COUNTRY_CODE;
final String v2 = "Country code supplied was not recognised."; // const-string v2, "Country code supplied was not recognised."
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/NumberParseException;-><init>(Lcom/google/i18n/phonenumbers/NumberParseException$ErrorType;Ljava/lang/String;)V */
/* throw v0 */
} // :cond_5
if ( p2 != null) { // if-eqz p2, :cond_8
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getGeneralDesc ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getGeneralDesc()Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;
v0 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v3 ).getNationalNumberPattern ( ); // invoke-virtual {v3}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->getNationalNumberPattern()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v0 ).getPatternForRegex ( v4 ); // invoke-virtual {v0, v4}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v4 ).matcher ( v2 ); // invoke-virtual {v4, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
/* if-nez v0, :cond_8 */
v0 = (( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getCountryCode ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getCountryCode()I
java.lang.String .valueOf ( v0 );
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
v6 = (( java.lang.String ) v2 ).startsWith ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_8
/* new-instance v6, Ljava/lang/StringBuffer; */
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
(( java.lang.String ) v2 ).substring ( v5 ); // invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* invoke-direct {v6, v2}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/String;)V */
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getNationalPrefixForParsing ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNationalPrefixForParsing()Ljava/lang/String;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneMetadata ) p2 ).getNationalPrefixTransformRule ( ); // invoke-virtual {p2}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneMetadata;->getNationalPrefixTransformRule()Ljava/lang/String;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).maybeStripNationalPrefix ( v6, v2, v5, v4 ); // invoke-virtual {p0, v6, v2, v5, v4}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->maybeStripNationalPrefix(Ljava/lang/StringBuffer;Ljava/lang/String;Ljava/lang/String;Ljava/util/regex/Pattern;)V
v2 = this.regexCache;
(( com.google.i18n.phonenumbers.Phonemetadata$PhoneNumberDesc ) v3 ).getPossibleNumberPattern ( ); // invoke-virtual {v3}, Lcom/google/i18n/phonenumbers/Phonemetadata$PhoneNumberDesc;->getPossibleNumberPattern()Ljava/lang/String;
(( com.google.i18n.phonenumbers.RegexCache ) v2 ).getPatternForRegex ( v3 ); // invoke-virtual {v2, v3}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v2 ).matcher ( v6 ); // invoke-virtual {v2, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
(( java.util.regex.Pattern ) v4 ).matcher ( v6 ); // invoke-virtual {v4, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v3 = (( java.util.regex.Matcher ) v3 ).matches ( ); // invoke-virtual {v3}, Ljava/util/regex/Matcher;->matches()Z
/* if-nez v3, :cond_6 */
v3 = (( java.util.regex.Matcher ) v2 ).lookingAt ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v3 != null) { // if-eqz v3, :cond_8
v2 = (( java.util.regex.Matcher ) v2 ).end ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->end()I
v3 = (( java.lang.StringBuffer ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/StringBuffer;->length()I
/* if-eq v2, v3, :cond_8 */
} // :cond_6
(( java.lang.StringBuffer ) p3 ).append ( v6 ); // invoke-virtual {p3, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;
if ( p4 != null) { // if-eqz p4, :cond_7
v1 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setCountryCodeSource ( v1 ); // invoke-virtual {p5, v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCodeSource(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber$CountryCodeSource;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
} // :cond_7
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setCountryCode ( v0 ); // invoke-virtual {p5, v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCode(I)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
/* goto/16 :goto_0 */
} // :cond_8
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p5 ).setCountryCode ( v1 ); // invoke-virtual {p5, v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setCountryCode(I)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
/* move v0, v1 */
/* goto/16 :goto_0 */
} // .end method
java.lang.String maybeStripExtension ( java.lang.StringBuffer p0 ) {
/* .locals 4 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.EXTN_PATTERN;
(( java.util.regex.Pattern ) v0 ).matcher ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v1 ).find ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
v2 = (( java.util.regex.Matcher ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I
(( java.lang.StringBuffer ) p1 ).substring ( v0, v2 ); // invoke-virtual {p1, v0, v2}, Ljava/lang/StringBuffer;->substring(II)Ljava/lang/String;
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil .isViablePhoneNumber ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 1; // const/4 v0, 0x1
v2 = (( java.util.regex.Matcher ) v1 ).groupCount ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->groupCount()I
} // :goto_0
/* if-gt v0, v2, :cond_1 */
(( java.util.regex.Matcher ) v1 ).group ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
if ( v3 != null) { // if-eqz v3, :cond_0
(( java.util.regex.Matcher ) v1 ).group ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
v1 = (( java.util.regex.Matcher ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->start()I
v2 = (( java.lang.StringBuffer ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I
(( java.lang.StringBuffer ) p1 ).delete ( v1, v2 ); // invoke-virtual {p1, v1, v2}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
} // :goto_1
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
final String v0 = ""; // const-string v0, ""
} // .end method
com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource maybeStripInternationalPrefixAndNormalize ( java.lang.StringBuffer p0, java.lang.String p1 ) {
/* .locals 2 */
v0 = (( java.lang.StringBuffer ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I
/* if-nez v0, :cond_0 */
v0 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_DEFAULT_COUNTRY;
} // :goto_0
} // :cond_0
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil.PLUS_CHARS_PATTERN;
(( java.util.regex.Pattern ) v0 ).matcher ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v1 = (( java.util.regex.Matcher ) v0 ).lookingAt ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v1 != null) { // if-eqz v1, :cond_1
int v1 = 0; // const/4 v1, 0x0
v0 = (( java.util.regex.Matcher ) v0 ).end ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->end()I
(( java.lang.StringBuffer ) p1 ).delete ( v1, v0 ); // invoke-virtual {p1, v1, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
com.google.i18n.phonenumbers.PhoneNumberUtil .normalize ( p1 );
v0 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_NUMBER_WITH_PLUS_SIGN;
} // :cond_1
v0 = this.regexCache;
(( com.google.i18n.phonenumbers.RegexCache ) v0 ).getPatternForRegex ( p2 ); // invoke-virtual {v0, p2}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
v1 = /* invoke-direct {p0, v0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parsePrefixAsIdd(Ljava/util/regex/Pattern;Ljava/lang/StringBuffer;)Z */
if ( v1 != null) { // if-eqz v1, :cond_2
com.google.i18n.phonenumbers.PhoneNumberUtil .normalize ( p1 );
v0 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_NUMBER_WITH_IDD;
} // :cond_2
com.google.i18n.phonenumbers.PhoneNumberUtil .normalize ( p1 );
v0 = /* invoke-direct {p0, v0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parsePrefixAsIdd(Ljava/util/regex/Pattern;Ljava/lang/StringBuffer;)Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_NUMBER_WITH_IDD;
} // :cond_3
v0 = com.google.i18n.phonenumbers.Phonenumber$PhoneNumber$CountryCodeSource.FROM_DEFAULT_COUNTRY;
} // .end method
void maybeStripNationalPrefix ( java.lang.StringBuffer p0, java.lang.String p1, java.lang.String p2, java.util.regex.Pattern p3 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = (( java.lang.StringBuffer ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-nez v1, :cond_1 */
} // :cond_0
} // :goto_0
return;
} // :cond_1
v1 = this.regexCache;
(( com.google.i18n.phonenumbers.RegexCache ) v1 ).getPatternForRegex ( p2 ); // invoke-virtual {v1, p2}, Lcom/google/i18n/phonenumbers/RegexCache;->getPatternForRegex(Ljava/lang/String;)Ljava/util/regex/Pattern;
(( java.util.regex.Pattern ) v1 ).matcher ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v2 = (( java.util.regex.Matcher ) v1 ).lookingAt ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->lookingAt()Z
if ( v2 != null) { // if-eqz v2, :cond_0
if ( p3 != null) { // if-eqz p3, :cond_2
v2 = (( java.lang.String ) p3 ).length ( ); // invoke-virtual {p3}, Ljava/lang/String;->length()I
if ( v2 != null) { // if-eqz v2, :cond_2
int v2 = 1; // const/4 v2, 0x1
(( java.util.regex.Matcher ) v1 ).group ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
/* if-nez v2, :cond_3 */
} // :cond_2
v0 = (( java.util.regex.Matcher ) v1 ).end ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->end()I
(( java.lang.StringBuffer ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/StringBuffer;->substring(I)Ljava/lang/String;
(( java.util.regex.Pattern ) p4 ).matcher ( v0 ); // invoke-virtual {p4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.util.regex.Matcher ) v1 ).end ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->end()I
(( java.lang.StringBuffer ) p1 ).delete ( v3, v0 ); // invoke-virtual {p1, v3, v0}, Ljava/lang/StringBuffer;->delete(II)Ljava/lang/StringBuffer;
} // :cond_3
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2, p1}, Ljava/lang/StringBuffer;-><init>(Ljava/lang/CharSequence;)V */
(( java.util.regex.Matcher ) v1 ).replaceFirst ( p3 ); // invoke-virtual {v1, p3}, Ljava/util/regex/Matcher;->replaceFirst(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuffer ) v2 ).replace ( v3, v0, v1 ); // invoke-virtual {v2, v3, v0, v1}, Ljava/lang/StringBuffer;->replace(IILjava/lang/String;)Ljava/lang/StringBuffer;
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.util.regex.Pattern ) p4 ).matcher ( v0 ); // invoke-virtual {p4, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
v0 = (( java.util.regex.Matcher ) v0 ).matches ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.lang.StringBuffer ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/StringBuffer;->length()I
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
(( java.lang.StringBuffer ) p1 ).replace ( v3, v0, v1 ); // invoke-virtual {p1, v3, v0, v1}, Ljava/lang/StringBuffer;->replace(IILjava/lang/String;)Ljava/lang/StringBuffer;
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber parse ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/i18n/phonenumbers/NumberParseException; */
/* } */
} // .end annotation
/* new-instance v0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).parse ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)V
} // .end method
public void parse ( java.lang.String p0, java.lang.String p1, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/i18n/phonenumbers/NumberParseException; */
/* } */
} // .end annotation
int v3 = 0; // const/4 v3, 0x0
int v4 = 1; // const/4 v4, 0x1
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)V */
return;
} // .end method
public com.google.i18n.phonenumbers.Phonenumber$PhoneNumber parseAndKeepRawInput ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/i18n/phonenumbers/NumberParseException; */
/* } */
} // .end annotation
/* new-instance v0, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v0}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).parseAndKeepRawInput ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parseAndKeepRawInput(Ljava/lang/String;Ljava/lang/String;Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)V
} // .end method
public void parseAndKeepRawInput ( java.lang.String p0, java.lang.String p1, com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/i18n/phonenumbers/NumberParseException; */
/* } */
} // .end annotation
int v3 = 1; // const/4 v3, 0x1
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move v4, v3 */
/* move-object v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parseHelper(Ljava/lang/String;Ljava/lang/String;ZZLcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)V */
return;
} // .end method
public Boolean truncateTooLongNumber ( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber p0 ) {
/* .locals 6 */
int v2 = 1; // const/4 v2, 0x1
v0 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isValidNumber ( p1 ); // invoke-virtual {p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v2 */
} // :goto_0
} // :cond_0
/* new-instance v3, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber; */
/* invoke-direct {v3}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;-><init>()V */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v3 ).mergeFrom ( p1 ); // invoke-virtual {v3, p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->mergeFrom(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).getNationalNumber ( ); // invoke-virtual {p1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->getNationalNumber()J
/* move-result-wide v0 */
} // :cond_1
/* const-wide/16 v4, 0xa */
/* div-long/2addr v0, v4 */
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) v3 ).setNationalNumber ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setNationalNumber(J)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
(( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isPossibleNumberWithReason ( v3 ); // invoke-virtual {p0, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isPossibleNumberWithReason(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;
v5 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.TOO_SHORT;
/* if-eq v4, v5, :cond_2 */
/* const-wide/16 v4, 0x0 */
/* cmp-long v4, v0, v4 */
/* if-nez v4, :cond_3 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
v4 = (( com.google.i18n.phonenumbers.PhoneNumberUtil ) p0 ).isValidNumber ( v3 ); // invoke-virtual {p0, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
(( com.google.i18n.phonenumbers.Phonenumber$PhoneNumber ) p1 ).setNationalNumber ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;->setNationalNumber(J)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
/* move v0, v2 */
} // .end method
