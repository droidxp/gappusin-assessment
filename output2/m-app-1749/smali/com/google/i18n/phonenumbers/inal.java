public class inal extends java.lang.Enum {
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/i18n/phonenumbers/PhoneNumberUtil; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "ValidationResult" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult $VALUES; //synthetic
public static final com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult INVALID_COUNTRY_CODE;
public static final com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult IS_POSSIBLE;
public static final com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult TOO_LONG;
public static final com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult TOO_SHORT;
/* # direct methods */
static inal ( ) {
/* .locals 6 */
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* new-instance v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult; */
final String v1 = "IS_POSSIBLE"; // const-string v1, "IS_POSSIBLE"
/* invoke-direct {v0, v1, v2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult; */
final String v1 = "INVALID_COUNTRY_CODE"; // const-string v1, "INVALID_COUNTRY_CODE"
/* invoke-direct {v0, v1, v3}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult; */
final String v1 = "TOO_SHORT"; // const-string v1, "TOO_SHORT"
/* invoke-direct {v0, v1, v4}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult; */
final String v1 = "TOO_LONG"; // const-string v1, "TOO_LONG"
/* invoke-direct {v0, v1, v5}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;-><init>(Ljava/lang/String;I)V */
int v0 = 4; // const/4 v0, 0x4
/* new-array v0, v0, [Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult; */
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.IS_POSSIBLE;
/* aput-object v1, v0, v2 */
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.INVALID_COUNTRY_CODE;
/* aput-object v1, v0, v3 */
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.TOO_SHORT;
/* aput-object v1, v0, v4 */
v1 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.TOO_LONG;
/* aput-object v1, v0, v5 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()V" */
/* } */
} // .end annotation
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* const-class v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult; */
} // .end method
public static final com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult values ( ) {
/* .locals 1 */
v0 = com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult.$VALUES;
(( com.google.i18n.phonenumbers.PhoneNumberUtil$ValidationResult ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/google/i18n/phonenumbers/PhoneNumberUtil$ValidationResult; */
} // .end method
