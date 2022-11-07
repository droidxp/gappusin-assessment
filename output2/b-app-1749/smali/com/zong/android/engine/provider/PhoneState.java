public class com.zong.android.engine.provider.PhoneState {
	 /* # static fields */
	 private static final java.lang.String a;
	 private static Boolean b;
	 /* # instance fields */
	 private java.lang.String c;
	 private java.lang.String d;
	 private java.lang.String e;
	 private java.lang.String f;
	 private java.lang.String g;
	 private java.lang.Integer h;
	 private java.lang.String i;
	 private java.lang.String j;
	 private java.lang.String k;
	 private java.lang.String l;
	 private java.lang.String m;
	 /* # direct methods */
	 static com.zong.android.engine.provider.PhoneState ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/zong/android/engine/provider/PhoneState; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 int v0 = 1; // const/4 v0, 0x1
		 com.zong.android.engine.provider.PhoneState.b = (v0!= 0);
		 return;
	 } // .end method
	 public com.zong.android.engine.provider.PhoneState ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( android.telephony.TelephonyManager ) p1 ).getDeviceId ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
		 this.c = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getLine1Number ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;
		 this.d = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getNetworkCountryIso ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;
		 this.e = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getNetworkOperator ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
		 this.f = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getNetworkOperatorName ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
		 this.g = v0;
		 v0 = 		 (( android.telephony.TelephonyManager ) p1 ).getNetworkType ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getNetworkType()I
		 java.lang.Integer .valueOf ( v0 );
		 this.h = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getSimCountryIso ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;
		 this.i = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getSimOperator ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;
		 this.j = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getSimOperatorName ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;
		 this.k = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getSimSerialNumber ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getSimSerialNumber()Ljava/lang/String;
		 this.l = v0;
		 (( android.telephony.TelephonyManager ) p1 ).getSubscriberId ( ); // invoke-virtual {p1}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
		 this.m = v0;
		 return;
	 } // .end method
	 private static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 try { // :try_start_0
				 com.google.i18n.phonenumbers.PhoneNumberUtil .getInstance ( );
				 v1 = com.zong.android.engine.provider.PhoneState.a;
				 final String v2 = "(G) Starts parsing phone number"; // const-string v2, "(G) Starts parsing phone number"
				 zongfuscated.q .a ( v1,v2 );
				 (( com.google.i18n.phonenumbers.PhoneNumberUtil ) v0 ).parse ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->parse(Ljava/lang/String;Ljava/lang/String;)Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;
				 v2 = 				 (( com.google.i18n.phonenumbers.PhoneNumberUtil ) v0 ).isValidNumber ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->isValidNumber(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;)Z
				 if ( v2 != null) { // if-eqz v2, :cond_0
					 v2 = com.google.i18n.phonenumbers.PhoneNumberUtil$PhoneNumberFormat.E164;
					 (( com.google.i18n.phonenumbers.PhoneNumberUtil ) v0 ).format ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/google/i18n/phonenumbers/PhoneNumberUtil;->format(Lcom/google/i18n/phonenumbers/Phonenumber$PhoneNumber;Lcom/google/i18n/phonenumbers/PhoneNumberUtil$PhoneNumberFormat;)Ljava/lang/String;
					 v0 = com.zong.android.engine.provider.PhoneState.a;
					 final String v1 = "(G) Phone number matching accept"; // const-string v1, "(G) Phone number matching accept"
					 int v2 = 1; // const/4 v2, 0x1
					 /* new-array v2, v2, [Ljava/lang/String; */
					 int v3 = 0; // const/4 v3, 0x0
					 /* aput-object p0, v2, v3 */
					 zongfuscated.q .a ( v0,v1,v2 );
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 } // :cond_0
			 } // :goto_0
			 /* :catch_0 */
			 /* move-exception v0 */
			 int p0 = 0; // const/4 p0, 0x0
		 } // .end method
		 private static java.lang.String b ( java.lang.String p0, java.lang.String p1 ) {
			 /* .locals 5 */
			 int v0 = 0; // const/4 v0, 0x0
			 if ( p0 != null) { // if-eqz p0, :cond_1
				 try { // :try_start_0
					 v1 = com.zong.android.engine.provider.PhoneState.a;
					 final String v2 = "Phone Number exist"; // const-string v2, "Phone Number exist"
					 int v3 = 1; // const/4 v3, 0x1
					 /* new-array v3, v3, [Ljava/lang/String; */
					 int v4 = 0; // const/4 v4, 0x0
					 /* aput-object p0, v3, v4 */
					 zongfuscated.q .a ( v1,v2,v3 );
					 (( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
					 final String v2 = "."; // const-string v2, "."
					 final String v3 = ""; // const-string v3, ""
					 (( java.lang.String ) v1 ).replace ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
					 final String v2 = "-"; // const-string v2, "-"
					 final String v3 = ""; // const-string v3, ""
					 (( java.lang.String ) v1 ).replace ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
					 final String v2 = "("; // const-string v2, "("
					 final String v3 = ""; // const-string v3, ""
					 (( java.lang.String ) v1 ).replace ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
					 final String v2 = ")"; // const-string v2, ")"
					 final String v3 = ""; // const-string v3, ""
					 (( java.lang.String ) v1 ).replace ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
					 final String v2 = "["; // const-string v2, "["
					 final String v3 = ""; // const-string v3, ""
					 (( java.lang.String ) v1 ).replace ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
					 final String v2 = "]"; // const-string v2, "]"
					 final String v3 = ""; // const-string v3, ""
					 (( java.lang.String ) v1 ).replace ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
					 v1 = com.zong.android.engine.provider.PhoneState.a;
					 final String v2 = "Phone Number filter"; // const-string v2, "Phone Number filter"
					 int v3 = 1; // const/4 v3, 0x1
					 /* new-array v3, v3, [Ljava/lang/String; */
					 int v4 = 0; // const/4 v4, 0x0
					 /* aput-object p0, v3, v4 */
					 zongfuscated.q .a ( v1,v2,v3 );
					 final String v1 = "+"; // const-string v1, "+"
					 v1 = 					 (( java.lang.String ) p0 ).startsWith ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
					 /* if-nez v1, :cond_0 */
					 v1 = com.zong.android.engine.provider.PhoneState.a;
					 final String v2 = "Doesn\'t have a (+)"; // const-string v2, "Doesn\'t have a (+)"
					 zongfuscated.q .a ( v1,v2 );
					 com.zong.android.engine.provider.E164 .fromIsoCountryCode ( p1 );
					 v2 = 					 (( com.zong.android.engine.provider.E164 ) v1 ).getCountryPrefix ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/provider/E164;->getCountryPrefix()I
					 java.lang.Integer .toString ( v2 );
					 v2 = 					 (( java.lang.String ) p0 ).startsWith ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
					 if ( v2 != null) { // if-eqz v2, :cond_2
						 v1 = com.zong.android.engine.provider.PhoneState.a;
						 final String v2 = "Starts with country code"; // const-string v2, "Starts with country code"
						 zongfuscated.q .a ( v1,v2 );
						 /* new-instance v1, Ljava/lang/StringBuilder; */
						 final String v2 = "+"; // const-string v2, "+"
						 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
						 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 } // :cond_0
				 } // :goto_0
				 final String v1 = "(\\+[0-9]{7,})"; // const-string v1, "(\\+[0-9]{7,})"
				 java.util.regex.Pattern .compile ( v1 );
				 (( java.util.regex.Pattern ) v1 ).matcher ( p0 ); // invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
				 v1 = 				 (( java.util.regex.Matcher ) v1 ).find ( ); // invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z
				 /* if-nez v1, :cond_5 */
				 v1 = com.zong.android.engine.provider.PhoneState.a;
				 final String v2 = "Final matching reject"; // const-string v2, "Final matching reject"
				 zongfuscated.q .a ( v1,v2 );
				 /* move-object p0, v0 */
			 } // :cond_1
		 } // :goto_1
	 } // :cond_2
	 v2 = com.zong.android.engine.provider.PhoneState.a;
	 final String v3 = "Doen\'t starts with country code"; // const-string v3, "Doen\'t starts with country code"
	 zongfuscated.q .a ( v2,v3 );
	 (( com.zong.android.engine.provider.E164 ) v1 ).getLocalPrefix ( ); // invoke-virtual {v1}, Lcom/zong/android/engine/provider/E164;->getLocalPrefix()Ljava/lang/String;
	 if ( v1 != null) { // if-eqz v1, :cond_4
		 v2 = com.zong.android.engine.provider.PhoneState.a;
		 final String v3 = "Local prefix for that country"; // const-string v3, "Local prefix for that country"
		 zongfuscated.q .a ( v2,v3 );
		 v2 = 		 (( java.lang.String ) p0 ).startsWith ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
		 if ( v2 != null) { // if-eqz v2, :cond_3
			 v2 = com.zong.android.engine.provider.PhoneState.a;
			 final String v3 = "Starts with local prefix"; // const-string v3, "Starts with local prefix"
			 zongfuscated.q .a ( v2,v3 );
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 com.zong.android.engine.provider.E164 .getCountryPrefix ( p1 );
			 java.lang.String .valueOf ( v3 );
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 v1 = 			 (( java.lang.String ) v1 ).length ( ); // invoke-virtual {v1}, Ljava/lang/String;->length()I
			 (( java.lang.String ) p0 ).substring ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
			 (( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 } // :cond_3
		 v1 = com.zong.android.engine.provider.PhoneState.a;
		 final String v2 = "Doesn\'t start with local prefix"; // const-string v2, "Doesn\'t start with local prefix"
		 zongfuscated.q .a ( v1,v2 );
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 com.zong.android.engine.provider.E164 .getCountryPrefix ( p1 );
		 java.lang.String .valueOf ( v2 );
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // :cond_4
	 v1 = com.zong.android.engine.provider.PhoneState.a;
	 final String v2 = "No local prefix for that country"; // const-string v2, "No local prefix for that country"
	 zongfuscated.q .a ( v1,v2 );
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 com.zong.android.engine.provider.E164 .getCountryPrefix ( p1 );
	 java.lang.String .valueOf ( v2 );
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* goto/16 :goto_0 */
} // :cond_5
v1 = com.zong.android.engine.provider.PhoneState.a;
final String v2 = "Final matching accept"; // const-string v2, "Final matching accept"
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/String; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object p0, v3, v4 */
zongfuscated.q .a ( v1,v2,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_1 */
/* :catch_0 */
/* move-exception v1 */
/* move-object p0, v0 */
/* goto/16 :goto_1 */
} // .end method
/* # virtual methods */
public java.lang.String getImeaId ( ) {
/* .locals 1 */
v0 = this.c;
} // .end method
public java.lang.String getLineNumber ( ) {
/* .locals 1 */
v0 = this.d;
} // .end method
public java.lang.String getMsisdn ( ) {
/* .locals 3 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
(( com.zong.android.engine.provider.PhoneState ) p0 ).getLineNumber ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/provider/PhoneState;->getLineNumber()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
final String v1 = "+"; // const-string v1, "+"
v1 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "+"; // const-string v2, "+"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_0
} // :goto_0
} // :cond_1
final String v0 = "null"; // const-string v0, "null"
} // .end method
public java.lang.String getMsisdn ( java.lang.String p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/zong/android/engine/provider/PhoneState;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.zong.android.engine.provider.PhoneState ) p0 ).getLineNumber ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/provider/PhoneState;->getLineNumber()Ljava/lang/String;
com.zong.android.engine.provider.PhoneState .a ( v0,p1 );
} // :goto_0
} // :cond_0
(( com.zong.android.engine.provider.PhoneState ) p0 ).getLineNumber ( ); // invoke-virtual {p0}, Lcom/zong/android/engine/provider/PhoneState;->getLineNumber()Ljava/lang/String;
com.zong.android.engine.provider.PhoneState .b ( v0,p1 );
} // .end method
public java.lang.String getMsisdn ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* sget-boolean v0, Lcom/zong/android/engine/provider/PhoneState;->b:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
com.zong.android.engine.provider.PhoneState .a ( p1,p2 );
} // :goto_0
} // :cond_0
com.zong.android.engine.provider.PhoneState .b ( p1,p2 );
} // .end method
public java.lang.String getNetIsoCountry ( ) {
/* .locals 1 */
v0 = this.e;
} // .end method
public java.lang.String getNetOp ( ) {
/* .locals 1 */
v0 = this.f;
} // .end method
public java.lang.String getNetOpName ( ) {
/* .locals 1 */
v0 = this.g;
} // .end method
public java.lang.Integer getNetType ( ) {
/* .locals 1 */
v0 = this.h;
} // .end method
public java.lang.String getSimIsoCountry ( ) {
/* .locals 1 */
v0 = this.i;
} // .end method
public java.lang.String getSimOp ( ) {
/* .locals 1 */
v0 = this.j;
} // .end method
public java.lang.String getSimOpName ( ) {
/* .locals 1 */
v0 = this.k;
} // .end method
public java.lang.String getSimSerial ( ) {
/* .locals 1 */
v0 = this.l;
} // .end method
public java.lang.String getSubsciberId ( ) {
/* .locals 1 */
v0 = this.m;
} // .end method
public final java.lang.String toString ( ) {
/* .locals 3 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "PHONE STATE:\n"; // const-string v1, "PHONE STATE:\n"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = " imeaId("; // const-string v1, " imeaId("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.c;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " lineNumber("; // const-string v1, " lineNumber("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.d;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " netIsoCountry("; // const-string v1, " netIsoCountry("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.e;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " netOp("; // const-string v1, " netOp("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.f;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " netOpName("; // const-string v1, " netOpName("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.g;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " netType("; // const-string v1, " netType("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.h;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " simIsoCountry("; // const-string v1, " simIsoCountry("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.i;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " simOp("; // const-string v1, " simOp("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.j;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " simOpName("; // const-string v1, " simOpName("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.k;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " simSerial("; // const-string v1, " simSerial("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.l;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " subsciberId("; // const-string v1, " subsciberId("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.m;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")\n"; // const-string v2, ")\n"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
