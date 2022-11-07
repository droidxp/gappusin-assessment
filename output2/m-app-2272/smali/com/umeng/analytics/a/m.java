public class com.umeng.analytics.a.m extends com.umeng.analytics.a.l implements com.umeng.analytics.a.g {
	 /* .source "Terminate.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String k;
	 private static final java.lang.String l;
	 private static final java.lang.String m;
	 /* # instance fields */
	 public com.umeng.analytics.a.o a;
	 public com.umeng.analytics.a.p b;
	 public Long c;
	 private java.util.ArrayList d;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Lcom/umeng/analytics/a/k;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.umeng.analytics.a.m ( ) {
/* .locals 2 */
/* .prologue */
/* .line 40 */
/* invoke-direct {p0}, Lcom/umeng/analytics/a/l;-><init>()V */
/* .line 31 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/m;->c:J */
/* .line 33 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d = v0;
/* .line 40 */
return;
} // .end method
public com.umeng.analytics.a.m ( ) {
/* .locals 2 */
/* .prologue */
/* .line 42 */
/* invoke-direct {p0}, Lcom/umeng/analytics/a/l;-><init>()V */
/* .line 31 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/m;->c:J */
/* .line 33 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.d = v0;
/* .line 43 */
this.e = p1;
/* .line 44 */
return;
} // .end method
public static android.content.SharedPreferences$Editor a ( android.content.SharedPreferences p0, java.lang.String p1, Long p2, Long p3 ) {
/* .locals 13 */
/* .prologue */
/* .line 134 */
/* sub-long v3, p4, p2 */
/* .line 135 */
final String v2 = "duration"; // const-string v2, "duration"
/* const-wide/16 v5, 0x0 */
/* move-result-wide v5 */
/* .line 137 */
/* .line 139 */
/* sget-boolean v2, Lcom/umeng/analytics/g;->j:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
	 /* .line 140 */
	 final String v2 = "activities"; // const-string v2, "activities"
	 final String v8 = ""; // const-string v8, ""
	 /* .line 142 */
	 final String v8 = ""; // const-string v8, ""
	 v8 = 	 (( java.lang.String ) v8 ).equals ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v8, :cond_0 */
	 /* .line 143 */
	 /* new-instance v8, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( v2 );
	 /* invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v2 = ";"; // const-string v2, ";"
	 (( java.lang.StringBuilder ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 145 */
} // :cond_0
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v8, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = "[\"%s\",%d]"; // const-string v2, "[\"%s\",%d]"
int v9 = 2; // const/4 v9, 0x2
/* new-array v9, v9, [Ljava/lang/Object; */
int v10 = 0; // const/4 v10, 0x0
/* aput-object p1, v9, v10 */
int v10 = 1; // const/4 v10, 0x1
/* const-wide/16 v11, 0x3e8 */
/* div-long v11, v3, v11 */
java.lang.Long .valueOf ( v11,v12 );
/* aput-object v11, v9, v10 */
java.lang.String .format ( v2,v9 );
(( java.lang.StringBuilder ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 146 */
final String v8 = "activities"; // const-string v8, "activities"
/* .line 147 */
final String v8 = "activities"; // const-string v8, "activities"
/* .line 150 */
} // :cond_1
final String v2 = "duration"; // const-string v2, "duration"
/* add-long/2addr v3, v5 */
/* .line 151 */
final String v2 = "terminate_time"; // const-string v2, "terminate_time"
/* move-wide/from16 v0, p4 */
/* .line 152 */
/* .line 154 */
} // .end method
public static android.content.SharedPreferences$Editor a ( android.content.SharedPreferences p0, java.util.ArrayList p1, Long p2, Long p3 ) {
/* .locals 17 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/SharedPreferences;", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/f;", */
/* ">;JJ)", */
/* "Landroid/content/SharedPreferences$Editor;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 158 */
/* sub-long v3, p4, p2 */
/* .line 159 */
final String v2 = "duration"; // const-string v2, "duration"
/* const-wide/16 v5, 0x0 */
/* move-object/from16 v0, p0 */
/* move-result-wide v5 */
/* .line 161 */
/* invoke-interface/range {p0 ..p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor; */
/* .line 163 */
v2 = /* invoke-virtual/range {p1 ..p1}, Ljava/util/ArrayList;->size()I */
/* if-lez v2, :cond_1 */
/* .line 164 */
final String v2 = "activities"; // const-string v2, "activities"
final String v8 = ""; // const-string v8, ""
/* move-object/from16 v0, p0 */
/* .line 165 */
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 167 */
v9 = android.text.TextUtils .isEmpty ( v2 );
/* if-nez v9, :cond_0 */
/* .line 168 */
(( java.lang.StringBuilder ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 169 */
final String v2 = ";"; // const-string v2, ";"
(( java.lang.StringBuilder ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 172 */
} // :cond_0
/* invoke-virtual/range {p1 ..p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator; */
v2 = } // :goto_0
/* if-nez v2, :cond_2 */
/* .line 177 */
v2 = (( java.lang.StringBuilder ) v8 ).length ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I
/* add-int/lit8 v2, v2, -0x1 */
(( java.lang.StringBuilder ) v8 ).deleteCharAt ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
/* .line 179 */
final String v2 = "activities"; // const-string v2, "activities"
/* .line 180 */
final String v2 = "activities"; // const-string v2, "activities"
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 183 */
} // :cond_1
final String v2 = "duration"; // const-string v2, "duration"
/* add-long/2addr v3, v5 */
/* .line 184 */
final String v2 = "terminate_time"; // const-string v2, "terminate_time"
/* move-wide/from16 v0, p4 */
/* .line 185 */
/* .line 187 */
/* .line 172 */
} // :cond_2
/* check-cast v2, Lcom/umeng/analytics/f; */
/* .line 173 */
final String v10 = "[\"%s\",%d]"; // const-string v10, "[\"%s\",%d]"
int v11 = 2; // const/4 v11, 0x2
/* new-array v11, v11, [Ljava/lang/Object; */
int v12 = 0; // const/4 v12, 0x0
v13 = this.a;
/* aput-object v13, v11, v12 */
int v12 = 1; // const/4 v12, 0x1
/* iget-wide v13, v2, Lcom/umeng/analytics/f;->b:J */
/* const-wide/16 v15, 0x3e8 */
/* div-long/2addr v13, v15 */
java.lang.Long .valueOf ( v13,v14 );
/* aput-object v2, v11, v12 */
java.lang.String .format ( v10,v11 );
(( java.lang.StringBuilder ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 174 */
final String v2 = ";"; // const-string v2, ";"
(( java.lang.StringBuilder ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end method
public static com.umeng.analytics.a.m a ( android.content.Context p0 ) {
/* .locals 5 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 47 */
com.umeng.analytics.j .e ( p0 );
/* .line 49 */
final String v2 = "session_id"; // const-string v2, "session_id"
/* .line 51 */
/* if-nez v2, :cond_0 */
/* .line 77 */
} // :goto_0
/* .line 53 */
} // :cond_0
/* new-instance v0, Lcom/umeng/analytics/a/m; */
/* invoke-direct {v0, v2}, Lcom/umeng/analytics/a/m;-><init>(Ljava/lang/String;)V */
/* .line 55 */
com.umeng.analytics.a.o .b ( p0 );
/* .line 56 */
if ( v2 != null) { // if-eqz v2, :cond_1
v3 = (( com.umeng.analytics.a.o ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/umeng/analytics/a/o;->a()Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 57 */
this.a = v2;
/* .line 60 */
} // :cond_1
com.umeng.analytics.a.p .a ( p0 );
/* .line 61 */
if ( v2 != null) { // if-eqz v2, :cond_2
v3 = (( com.umeng.analytics.a.p ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/umeng/analytics/a/p;->a()Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 62 */
this.b = v2;
/* .line 65 */
} // :cond_2
com.umeng.analytics.a.m .c ( v1 );
this.d = v2;
/* .line 66 */
com.umeng.analytics.a.m .d ( v1 );
/* move-result-wide v2 */
/* iput-wide v2, v0, Lcom/umeng/analytics/a/m;->c:J */
/* .line 68 */
com.umeng.analytics.a.m .b ( v1 );
/* .line 70 */
if ( v2 != null) { // if-eqz v2, :cond_3
/* array-length v3, v2 */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v3, v4, :cond_3 */
/* .line 71 */
int v3 = 0; // const/4 v3, 0x0
/* aget-object v3, v2, v3 */
this.g = v3;
/* .line 72 */
int v3 = 1; // const/4 v3, 0x1
/* aget-object v2, v2, v3 */
this.h = v2;
/* .line 75 */
} // :cond_3
com.umeng.analytics.a.m .a ( v1 );
} // .end method
private static void a ( android.content.SharedPreferences p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 81 */
/* .line 83 */
final String v1 = "duration"; // const-string v1, "duration"
/* const-wide/16 v2, 0x0 */
/* .line 84 */
final String v1 = "activities"; // const-string v1, "activities"
final String v2 = ""; // const-string v2, ""
/* .line 86 */
/* .line 87 */
return;
} // .end method
private static java.lang.String b ( android.content.SharedPreferences p0 ) {
/* .locals 4 */
/* .prologue */
/* const-wide/16 v2, 0x0 */
/* .line 96 */
final String v0 = "terminate_time"; // const-string v0, "terminate_time"
/* move-result-wide v0 */
/* .line 98 */
/* cmp-long v2, v0, v2 */
/* if-gtz v2, :cond_0 */
/* .line 100 */
int v0 = 0; // const/4 v0, 0x0
/* .line 103 */
} // :goto_0
} // :cond_0
/* new-instance v2, Ljava/util/Date; */
/* invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V */
com.umeng.common.b .a ( v2 );
final String v1 = " "; // const-string v1, " "
(( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
} // .end method
private static java.util.ArrayList c ( android.content.SharedPreferences p0 ) {
/* .locals 6 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/content/SharedPreferences;", */
/* ")", */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Lcom/umeng/analytics/a/k;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 108 */
final String v0 = "activities"; // const-string v0, "activities"
final String v1 = ""; // const-string v1, ""
/* .line 110 */
final String v0 = ""; // const-string v0, ""
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_1 */
/* .line 111 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 113 */
try { // :try_start_0
final String v2 = ";"; // const-string v2, ";"
(( java.lang.String ) v1 ).split ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 114 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* array-length v3, v2 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-lt v1, v3, :cond_0 */
/* .line 123 */
} // :goto_1
v1 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-lez v1, :cond_1 */
/* .line 125 */
} // :goto_2
/* .line 115 */
} // :cond_0
try { // :try_start_1
/* aget-object v3, v2, v1 */
/* .line 117 */
/* new-instance v4, Lcom/umeng/analytics/a/k; */
/* new-instance v5, Lorg/json/JSONArray; */
/* invoke-direct {v5, v3}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v4, v5}, Lcom/umeng/analytics/a/k;-><init>(Lorg/json/JSONArray;)V */
(( java.util.ArrayList ) v0 ).add ( v4 ); // invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 114 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 119 */
/* :catch_0 */
/* move-exception v1 */
/* .line 120 */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
/* .line 125 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void c ( org.json.JSONObject p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 213 */
v0 = this.b;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.b;
(( com.umeng.analytics.a.p ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/p;->b(Lorg/json/JSONObject;)V
/* .line 214 */
} // :cond_0
return;
} // .end method
private static Long d ( android.content.SharedPreferences p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 129 */
final String v0 = "duration"; // const-string v0, "duration"
/* const-wide/16 v1, 0x0 */
/* move-result-wide v0 */
/* const-wide/16 v2, 0x3e8 */
/* div-long/2addr v0, v2 */
/* return-wide v0 */
} // .end method
private void d ( org.json.JSONObject p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 217 */
v0 = this.a;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.a;
(( com.umeng.analytics.a.o ) v0 ).b ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/o;->b(Lorg/json/JSONObject;)V
/* .line 218 */
} // :cond_0
return;
} // .end method
private void e ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 221 */
/* new-instance v0, Lcom/umeng/analytics/a/o; */
/* invoke-direct {v0}, Lcom/umeng/analytics/a/o;-><init>()V */
/* .line 222 */
(( com.umeng.analytics.a.o ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/o;->a(Lorg/json/JSONObject;)V
/* .line 223 */
v1 = (( com.umeng.analytics.a.o ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/o;->a()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 224 */
this.a = v0;
/* .line 226 */
} // :cond_0
return;
} // .end method
private void f ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 229 */
/* new-instance v0, Lcom/umeng/analytics/a/p; */
/* invoke-direct {v0}, Lcom/umeng/analytics/a/p;-><init>()V */
/* .line 230 */
(( com.umeng.analytics.a.p ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/umeng/analytics/a/p;->a(Lorg/json/JSONObject;)V
/* .line 231 */
v1 = (( com.umeng.analytics.a.p ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/umeng/analytics/a/p;->a()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 232 */
this.b = v0;
/* .line 234 */
} // :cond_0
return;
} // .end method
private void g ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 237 */
final String v0 = "activities"; // const-string v0, "activities"
v0 = (( org.json.JSONObject ) p1 ).has ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 238 */
final String v0 = "activities"; // const-string v0, "activities"
(( org.json.JSONObject ) p1 ).getJSONArray ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;
/* .line 241 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v2 = (( org.json.JSONArray ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/json/JSONArray;->length()I
/* if-lt v0, v2, :cond_1 */
/* .line 248 */
} // :cond_0
return;
/* .line 243 */
} // :cond_1
/* new-instance v2, Lcom/umeng/analytics/a/k; */
(( org.json.JSONArray ) v1 ).getJSONArray ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->getJSONArray(I)Lorg/json/JSONArray;
/* invoke-direct {v2, v3}, Lcom/umeng/analytics/a/k;-><init>(Lorg/json/JSONArray;)V */
/* .line 245 */
v3 = this.d;
(( java.util.ArrayList ) v3 ).add ( v2 ); // invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 241 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void h ( org.json.JSONObject p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 251 */
v0 = this.d;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_0 */
/* .line 266 */
} // :goto_0
return;
/* .line 254 */
} // :cond_0
/* new-instance v1, Lorg/json/JSONArray; */
/* invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V */
/* .line 256 */
v0 = this.d;
(( java.util.ArrayList ) v0 ).iterator ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v0 = } // :goto_1
/* if-nez v0, :cond_1 */
/* .line 265 */
final String v0 = "activities"; // const-string v0, "activities"
(( org.json.JSONObject ) p1 ).put ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 256 */
} // :cond_1
/* check-cast v0, Lcom/umeng/analytics/a/k; */
/* .line 258 */
/* new-instance v3, Lorg/json/JSONArray; */
/* invoke-direct {v3}, Lorg/json/JSONArray;-><init>()V */
/* .line 259 */
v4 = this.a;
(( org.json.JSONArray ) v3 ).put ( v4 ); // invoke-virtual {v3, v4}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
/* .line 260 */
/* iget v0, v0, Lcom/umeng/analytics/a/k;->b:I */
(( org.json.JSONArray ) v3 ).put ( v0 ); // invoke-virtual {v3, v0}, Lorg/json/JSONArray;->put(I)Lorg/json/JSONArray;
/* .line 262 */
(( org.json.JSONArray ) v1 ).put ( v3 ); // invoke-virtual {v1, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
} // .end method
/* # virtual methods */
public void a ( org.json.JSONObject p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 273 */
try { // :try_start_0
/* invoke-super {p0, p1}, Lcom/umeng/analytics/a/l;->a(Lorg/json/JSONObject;)V */
/* .line 275 */
final String v0 = "duration"; // const-string v0, "duration"
(( org.json.JSONObject ) p1 ).getLong ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/umeng/analytics/a/m;->c:J */
/* .line 277 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/m;->f(Lorg/json/JSONObject;)V */
/* .line 278 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/m;->e(Lorg/json/JSONObject;)V */
/* .line 279 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/m;->g(Lorg/json/JSONObject;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 283 */
} // :goto_0
return;
/* .line 280 */
/* :catch_0 */
/* move-exception v0 */
/* .line 281 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public Boolean a ( ) {
/* .locals 4 */
/* .prologue */
/* .line 191 */
v0 = this.a;
/* if-nez v0, :cond_0 */
/* sget-boolean v0, Lcom/umeng/analytics/g;->i:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 192 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "missing location info in Terminate"; // const-string v1, "missing location info in Terminate"
com.umeng.common.Log .c ( v0,v1 );
/* .line 195 */
} // :cond_0
v0 = this.b;
/* if-nez v0, :cond_1 */
/* .line 196 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "missing receive and transport Traffic in Terminate "; // const-string v1, "missing receive and transport Traffic in Terminate "
com.umeng.common.Log .e ( v0,v1 );
/* .line 199 */
} // :cond_1
/* iget-wide v0, p0, Lcom/umeng/analytics/a/m;->c:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
/* if-gtz v0, :cond_2 */
/* .line 200 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "missing Duration info in Terminate"; // const-string v1, "missing Duration info in Terminate"
com.umeng.common.Log .b ( v0,v1 );
/* .line 202 */
int v0 = 0; // const/4 v0, 0x0
/* .line 209 */
} // :goto_0
/* .line 205 */
} // :cond_2
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = this.d;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
/* if-nez v0, :cond_4 */
/* .line 206 */
} // :cond_3
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "missing Activities info in Terminate"; // const-string v1, "missing Activities info in Terminate"
com.umeng.common.Log .e ( v0,v1 );
/* .line 209 */
} // :cond_4
v0 = /* invoke-super {p0}, Lcom/umeng/analytics/a/l;->a()Z */
} // .end method
public void b ( org.json.JSONObject p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 288 */
/* invoke-super {p0, p1}, Lcom/umeng/analytics/a/l;->b(Lorg/json/JSONObject;)V */
/* .line 290 */
/* iget-wide v0, p0, Lcom/umeng/analytics/a/m;->c:J */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_0 */
/* .line 291 */
final String v0 = "duration"; // const-string v0, "duration"
/* iget-wide v1, p0, Lcom/umeng/analytics/a/m;->c:J */
(( org.json.JSONObject ) p1 ).put ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;
/* .line 294 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/m;->c(Lorg/json/JSONObject;)V */
/* .line 295 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/m;->d(Lorg/json/JSONObject;)V */
/* .line 296 */
/* invoke-direct {p0, p1}, Lcom/umeng/analytics/a/m;->h(Lorg/json/JSONObject;)V */
/* .line 298 */
return;
} // .end method
