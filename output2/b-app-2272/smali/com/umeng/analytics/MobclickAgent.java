public class com.umeng.analytics.MobclickAgent {
	 /* .source "MobclickAgent.java" */
	 /* # static fields */
	 private static final com.umeng.analytics.b a;
	 private static final com.umeng.analytics.onlineconfig.a b;
	 private static c; //synthetic
	 /* # direct methods */
	 static com.umeng.analytics.MobclickAgent ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 21 */
		 /* new-instance v0, Lcom/umeng/analytics/b; */
		 /* invoke-direct {v0}, Lcom/umeng/analytics/b;-><init>()V */
		 /* .line 22 */
		 /* new-instance v0, Lcom/umeng/analytics/onlineconfig/a; */
		 /* invoke-direct {v0}, Lcom/umeng/analytics/onlineconfig/a;-><init>()V */
		 /* .line 25 */
		 v0 = com.umeng.analytics.MobclickAgent.b;
		 v1 = com.umeng.analytics.MobclickAgent.a;
		 (( com.umeng.analytics.onlineconfig.a ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/analytics/onlineconfig/a;->a(Lcom/umeng/analytics/onlineconfig/c;)V
		 /* .line 26 */
		 return;
	 } // .end method
	 public com.umeng.analytics.MobclickAgent ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static com.umeng.analytics.b a ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 63 */
		 v0 = com.umeng.analytics.MobclickAgent.a;
	 } // .end method
	 static b ( ) { //synthethic
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 20 */
		 v0 = com.umeng.analytics.MobclickAgent.c;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 com.umeng.analytics.Gender .values ( );
	 /* array-length v0, v0 */
	 /* new-array v0, v0, [I */
	 try { // :try_start_0
		 v1 = com.umeng.analytics.Gender.Female;
		 v1 = 		 (( com.umeng.analytics.Gender ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/umeng/analytics/Gender;->ordinal()I
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput v2, v0, v1 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_2 */
	 } // :goto_1
	 try { // :try_start_1
		 v1 = com.umeng.analytics.Gender.Male;
		 v1 = 		 (( com.umeng.analytics.Gender ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/umeng/analytics/Gender;->ordinal()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput v2, v0, v1 */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_1 */
	 } // :goto_2
	 try { // :try_start_2
		 v1 = com.umeng.analytics.Gender.Unknown;
		 v1 = 		 (( com.umeng.analytics.Gender ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/umeng/analytics/Gender;->ordinal()I
		 int v2 = 3; // const/4 v2, 0x3
		 /* aput v2, v0, v1 */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_0 */
	 } // :goto_3
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* :catch_1 */
	 /* move-exception v1 */
	 /* :catch_2 */
	 /* move-exception v1 */
} // .end method
public static void flush ( android.content.Context p0 ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 219 */
	 v0 = com.umeng.analytics.MobclickAgent.a;
	 (( com.umeng.analytics.b ) v0 ).c ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/b;->c(Landroid/content/Context;)V
	 /* .line 220 */
	 return;
} // .end method
public static java.lang.String getConfigParams ( android.content.Context p0, java.lang.String p1 ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 392 */
	 com.umeng.analytics.j .b ( p0 );
	 /* .line 393 */
	 final String v1 = ""; // const-string v1, ""
} // .end method
public static void onError ( android.content.Context p0 ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 180 */
	 return;
} // .end method
public static void onError ( android.content.Context p0, java.lang.String p1 ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 188 */
	 if ( p1 != null) { // if-eqz p1, :cond_0
		 v0 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* if-nez v0, :cond_1 */
		 /* .line 189 */
	 } // :cond_0
	 final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
	 final String v1 = "unexpected empty appkey in onError"; // const-string v1, "unexpected empty appkey in onError"
	 com.umeng.common.Log .b ( v0,v1 );
	 /* .line 194 */
} // :goto_0
return;
/* .line 192 */
} // :cond_1
v0 = com.umeng.analytics.MobclickAgent.a;
this.l = p1;
/* .line 193 */
com.umeng.analytics.MobclickAgent .onError ( p0 );
} // .end method
public static void onEvent ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 7 */
/* .prologue */
/* .line 229 */
v0 = com.umeng.analytics.MobclickAgent.a;
int v3 = 0; // const/4 v3, 0x0
/* const-wide/16 v4, -0x1 */
int v6 = 1; // const/4 v6, 0x1
/* move-object v1, p0 */
/* move-object v2, p1 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JI)V */
/* .line 230 */
return;
} // .end method
public static void onEvent ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
/* .locals 7 */
/* .prologue */
/* .line 238 */
v0 = com.umeng.analytics.MobclickAgent.a;
int v3 = 0; // const/4 v3, 0x0
/* const-wide/16 v4, -0x1 */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v6, p2 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JI)V */
/* .line 239 */
return;
} // .end method
public static void onEvent ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 7 */
/* .prologue */
/* .line 263 */
v0 = android.text.TextUtils .isEmpty ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 264 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "label is null or empty"; // const-string v1, "label is null or empty"
com.umeng.common.Log .a ( v0,v1 );
/* .line 269 */
} // :goto_0
return;
/* .line 268 */
} // :cond_0
v0 = com.umeng.analytics.MobclickAgent.a;
/* const-wide/16 v4, -0x1 */
int v6 = 1; // const/4 v6, 0x1
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JI)V */
} // .end method
public static void onEvent ( android.content.Context p0, java.lang.String p1, java.lang.String p2, Integer p3 ) {
/* .locals 7 */
/* .prologue */
/* .line 248 */
v0 = android.text.TextUtils .isEmpty ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 249 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "label is null or empty"; // const-string v1, "label is null or empty"
com.umeng.common.Log .a ( v0,v1 );
/* .line 254 */
} // :goto_0
return;
/* .line 253 */
} // :cond_0
v0 = com.umeng.analytics.MobclickAgent.a;
/* const-wide/16 v4, -0x1 */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move v6, p3 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JI)V */
} // .end method
public static void onEvent ( android.content.Context p0, java.lang.String p1, java.util.HashMap p2 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 279 */
v0 = com.umeng.analytics.MobclickAgent.a;
/* const-wide/16 v4, -0x1 */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* invoke-virtual/range {v0 ..v5}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;J)V */
/* .line 280 */
return;
} // .end method
public static void onEventBegin ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 334 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).b ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/umeng/analytics/b;->b(Landroid/content/Context;Ljava/lang/String;)V
/* .line 335 */
return;
} // .end method
public static void onEventBegin ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
/* .prologue */
/* .line 352 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).a ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
/* .line 353 */
return;
} // .end method
public static void onEventDuration ( android.content.Context p0, java.lang.String p1, Long p2 ) {
/* .locals 7 */
/* .prologue */
/* .line 290 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, p2, v0 */
/* if-gtz v0, :cond_0 */
/* .line 291 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "duration is not valid in onEventDuration"; // const-string v1, "duration is not valid in onEventDuration"
com.umeng.common.Log .a ( v0,v1 );
/* .line 295 */
} // :goto_0
return;
/* .line 294 */
} // :cond_0
v0 = com.umeng.analytics.MobclickAgent.a;
int v3 = 0; // const/4 v3, 0x0
int v6 = 1; // const/4 v6, 0x1
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-wide v4, p2 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JI)V */
} // .end method
public static void onEventDuration ( android.content.Context p0, java.lang.String p1, java.lang.String p2, Long p3 ) {
/* .locals 7 */
/* .prologue */
/* .line 304 */
v0 = android.text.TextUtils .isEmpty ( p2 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 305 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "label is null or empty"; // const-string v1, "label is null or empty"
com.umeng.common.Log .a ( v0,v1 );
/* .line 313 */
} // :goto_0
return;
/* .line 308 */
} // :cond_0
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, p3, v0 */
/* if-gtz v0, :cond_1 */
/* .line 309 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "duration is not valid in onEventDuration"; // const-string v1, "duration is not valid in onEventDuration"
com.umeng.common.Log .a ( v0,v1 );
/* .line 312 */
} // :cond_1
v0 = com.umeng.analytics.MobclickAgent.a;
int v6 = 1; // const/4 v6, 0x1
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-wide v4, p3 */
/* invoke-virtual/range {v0 ..v6}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JI)V */
} // .end method
public static void onEventDuration ( android.content.Context p0, java.lang.String p1, java.util.HashMap p2, Long p3 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;J)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 322 */
/* const-wide/16 v0, 0x0 */
/* cmp-long v0, p3, v0 */
/* if-gtz v0, :cond_0 */
/* .line 323 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "duration is not valid in onEventDuration"; // const-string v1, "duration is not valid in onEventDuration"
com.umeng.common.Log .a ( v0,v1 );
/* .line 327 */
} // :goto_0
return;
/* .line 326 */
} // :cond_0
v0 = com.umeng.analytics.MobclickAgent.a;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-wide v4, p3 */
/* invoke-virtual/range {v0 ..v5}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;J)V */
} // .end method
public static void onEventEnd ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 343 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).c ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/umeng/analytics/b;->c(Landroid/content/Context;Ljava/lang/String;)V
/* .line 344 */
return;
} // .end method
public static void onEventEnd ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
/* .prologue */
/* .line 361 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).b ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/umeng/analytics/b;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
/* .line 362 */
return;
} // .end method
public static void onKVEventBegin ( android.content.Context p0, java.lang.String p1, java.util.HashMap p2, java.lang.String p3 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/Context;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;", */
/* "Ljava/lang/String;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 371 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).a ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;)V
/* .line 372 */
return;
} // .end method
public static void onKVEventEnd ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 1 */
/* .prologue */
/* .line 380 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).c ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/umeng/analytics/b;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
/* .line 381 */
return;
} // .end method
public static void onKillProcess ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 486 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).d ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/b;->d(Landroid/content/Context;)V
/* .line 487 */
return;
} // .end method
public static void onPageEnd ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 104 */
v0 = android.text.TextUtils .isEmpty ( p0 );
/* if-nez v0, :cond_0 */
/* .line 105 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/b;->b(Ljava/lang/String;)V
/* .line 109 */
} // :goto_0
return;
/* .line 107 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "pageName is null or empty"; // const-string v1, "pageName is null or empty"
com.umeng.common.Log .b ( v0,v1 );
} // .end method
public static void onPageStart ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 93 */
v0 = android.text.TextUtils .isEmpty ( p0 );
/* if-nez v0, :cond_0 */
/* .line 94 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;)V
/* .line 98 */
} // :goto_0
return;
/* .line 96 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "pageName is null or empty"; // const-string v1, "pageName is null or empty"
com.umeng.common.Log .b ( v0,v1 );
} // .end method
public static void onPause ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 134 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;)V
/* .line 135 */
return;
} // .end method
public static void onResume ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 142 */
/* if-nez p0, :cond_0 */
/* .line 143 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "unexpected null context in onResume"; // const-string v1, "unexpected null context in onResume"
com.umeng.common.Log .b ( v0,v1 );
/* .line 148 */
} // :goto_0
return;
/* .line 147 */
} // :cond_0
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/b;->b(Landroid/content/Context;)V
} // .end method
public static void onResume ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .prologue */
/* .line 157 */
/* if-nez p0, :cond_0 */
/* .line 158 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "unexpected null context in onResume"; // const-string v1, "unexpected null context in onResume"
com.umeng.common.Log .b ( v0,v1 );
/* .line 170 */
} // :goto_0
return;
/* .line 162 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_2 */
/* .line 163 */
} // :cond_1
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "unexpected empty appkey in onResume"; // const-string v1, "unexpected empty appkey in onResume"
com.umeng.common.Log .b ( v0,v1 );
/* .line 167 */
} // :cond_2
v0 = com.umeng.analytics.MobclickAgent.a;
this.l = p1;
/* .line 168 */
v0 = com.umeng.analytics.MobclickAgent.a;
this.k = p2;
/* .line 169 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).b ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/b;->b(Landroid/content/Context;)V
} // .end method
public static void openActivityDurationTrack ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 85 */
com.umeng.analytics.g.j = (p0!= 0);
/* .line 86 */
return;
} // .end method
public static void reportError ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 202 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/String;)V
/* .line 203 */
return;
} // .end method
public static void reportError ( android.content.Context p0, java.lang.Throwable p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 210 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/umeng/analytics/b;->a(Landroid/content/Context;Ljava/lang/Throwable;)V
/* .line 211 */
return;
} // .end method
public static void setAutoLocation ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 34 */
com.umeng.analytics.g.i = (p0!= 0);
/* .line 35 */
return;
} // .end method
public static void setDebugMode ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 116 */
com.umeng.common.Log.LOG = (p0!= 0);
/* .line 117 */
return;
} // .end method
public static void setDefaultReportPolicy ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 128 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "\u6b64\u65b9\u6cd5\u4e0d\u518d\u4f7f\u7528\uff0c\u8bf7\u4f7f\u7528\u5728\u7ebf\u53c2\u6570\u914d\u7f6e\uff0c\u53d1\u9001\u7b56\u7565"; // const-string v1, "\u6b64\u65b9\u6cd5\u4e0d\u518d\u4f7f\u7528\uff0c\u8bf7\u4f7f\u7528\u5728\u7ebf\u53c2\u6570\u914d\u7f6e\uff0c\u53d1\u9001\u7b56\u7565"
com.umeng.common.Log .e ( v0,v1 );
/* .line 129 */
return;
} // .end method
public static void setEnableEventBuffer ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 52 */
com.umeng.analytics.g.m = (p0!= 0);
/* .line 53 */
return;
} // .end method
public static void setOnlineConfigureListener ( com.umeng.analytics.onlineconfig.UmengOnlineConfigureListener p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 59 */
v0 = com.umeng.analytics.MobclickAgent.b;
(( com.umeng.analytics.onlineconfig.a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/onlineconfig/a;->a(Lcom/umeng/analytics/onlineconfig/UmengOnlineConfigureListener;)V
/* .line 60 */
return;
} // .end method
public static void setOpenGLContext ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 71 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 72 */
com.umeng.common.b .a ( p0 );
/* .line 73 */
/* array-length v1, v0 */
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_0 */
/* .line 74 */
v1 = com.umeng.analytics.MobclickAgent.a;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v2, v0, v2 */
this.b = v2;
/* .line 75 */
v1 = com.umeng.analytics.MobclickAgent.a;
int v2 = 1; // const/4 v2, 0x1
/* aget-object v0, v0, v2 */
this.c = v0;
/* .line 78 */
} // :cond_0
return;
} // .end method
public static void setSessionContinueMillis ( Long p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 45 */
/* sput-wide p0, Lcom/umeng/analytics/g;->d:J */
/* .line 46 */
return;
} // .end method
public static void setWrapper ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 38 */
v0 = com.umeng.analytics.MobclickAgent.a;
(( com.umeng.analytics.b ) v0 ).a ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/umeng/analytics/b;->a(Ljava/lang/String;Ljava/lang/String;)V
/* .line 39 */
return;
} // .end method
public static void updateOnlineConfig ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 416 */
v0 = com.umeng.analytics.MobclickAgent.b;
(( com.umeng.analytics.onlineconfig.a ) v0 ).a ( p0 ); // invoke-virtual {v0, p0}, Lcom/umeng/analytics/onlineconfig/a;->a(Landroid/content/Context;)V
/* .line 417 */
return;
} // .end method
public static void updateOnlineConfig ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .prologue */
/* .line 404 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-nez v0, :cond_1 */
/* .line 405 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "unexpected empty appkey in onResume"; // const-string v1, "unexpected empty appkey in onResume"
com.umeng.common.Log .b ( v0,v1 );
/* .line 410 */
} // :goto_0
return;
/* .line 409 */
} // :cond_1
v0 = com.umeng.analytics.MobclickAgent.b;
(( com.umeng.analytics.onlineconfig.a ) v0 ).a ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/umeng/analytics/onlineconfig/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
} // .end method
/* # virtual methods */
public void setAge ( android.content.Context p0, Integer p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 451 */
com.umeng.analytics.j .a ( p1 );
/* .line 452 */
/* if-ltz p2, :cond_0 */
/* const/16 v1, 0xc8 */
/* if-le p2, v1, :cond_1 */
/* .line 453 */
} // :cond_0
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "not a valid age!"; // const-string v1, "not a valid age!"
com.umeng.common.Log .a ( v0,v1 );
/* .line 458 */
} // :goto_0
return;
/* .line 456 */
} // :cond_1
final String v1 = "age"; // const-string v1, "age"
} // .end method
public void setGender ( android.content.Context p0, com.umeng.analytics.Gender p1 ) {
/* .locals 4 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 428 */
com.umeng.analytics.j .a ( p1 );
/* .line 430 */
com.umeng.analytics.MobclickAgent .b ( );
v3 = (( com.umeng.analytics.Gender ) p2 ).ordinal ( ); // invoke-virtual {p2}, Lcom/umeng/analytics/Gender;->ordinal()I
/* aget v2, v2, v3 */
/* packed-switch v2, :pswitch_data_0 */
/* .line 441 */
} // :goto_0
/* :pswitch_0 */
final String v2 = "gender"; // const-string v2, "gender"
/* .line 443 */
return;
/* .line 432 */
/* :pswitch_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 433 */
/* .line 435 */
/* :pswitch_2 */
int v0 = 2; // const/4 v0, 0x2
/* .line 436 */
/* .line 430 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public void setUserID ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 3 */
/* .prologue */
/* .line 467 */
com.umeng.analytics.j .a ( p1 );
/* .line 468 */
v1 = android.text.TextUtils .isEmpty ( p2 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 469 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "userID is null or empty"; // const-string v1, "userID is null or empty"
com.umeng.common.Log .a ( v0,v1 );
/* .line 479 */
} // :goto_0
return;
/* .line 472 */
} // :cond_0
final String v2 = "user_id"; // const-string v2, "user_id"
/* .line 474 */
v1 = android.text.TextUtils .isEmpty ( p3 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 475 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "id source is null or empty"; // const-string v1, "id source is null or empty"
com.umeng.common.Log .a ( v0,v1 );
/* .line 478 */
} // :cond_1
final String v1 = "id_source"; // const-string v1, "id_source"
} // .end method
