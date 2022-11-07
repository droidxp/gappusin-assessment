public class inal {
	 /* .source "UmengStoreHelper.java" */
	 /* # static fields */
	 static Long a;
	 static Long b;
	 private static final java.lang.String c;
	 private static final java.lang.String d;
	 private static final java.lang.String e;
	 private static final java.lang.String f;
	 private static final java.lang.String g;
	 private static final java.lang.String h;
	 private static final java.lang.String i;
	 private static final java.lang.String j;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 114 */
		 /* const-wide/32 v0, 0x48190800 */
		 /* sput-wide v0, Lcom/umeng/analytics/j;->a:J */
		 /* .line 115 */
		 /* const-wide/32 v0, 0x200000 */
		 /* sput-wide v0, Lcom/umeng/analytics/j;->b:J */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static android.content.SharedPreferences a ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 40 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "mobclick_agent_user_"; // const-string v1, "mobclick_agent_user_"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 } // .end method
	 static java.lang.String a ( java.io.InputStream p0 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 180 */
	 /* new-instance v0, Ljava/io/InputStreamReader; */
	 /* invoke-direct {v0, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
	 /* .line 182 */
	 /* const/16 v1, 0x400 */
	 /* new-array v1, v1, [C */
	 /* .line 185 */
	 /* new-instance v2, Ljava/io/StringWriter; */
	 /* invoke-direct {v2}, Ljava/io/StringWriter;-><init>()V */
	 /* .line 187 */
} // :goto_0
int v3 = -1; // const/4 v3, -0x1
v4 = (( java.io.InputStreamReader ) v0 ).read ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/InputStreamReader;->read([C)I
/* if-ne v3, v4, :cond_0 */
/* .line 191 */
(( java.io.StringWriter ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/io/StringWriter;->toString()Ljava/lang/String;
/* .line 188 */
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
(( java.io.StringWriter ) v2 ).write ( v1, v3, v4 ); // invoke-virtual {v2, v1, v3, v4}, Ljava/io/StringWriter;->write([CII)V
} // .end method
static org.json.JSONObject a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 4 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 128 */
com.umeng.analytics.j .g ( p0 );
/* .line 131 */
try { // :try_start_0
/* new-instance v2, Ljava/io/File; */
(( android.content.Context ) p0 ).getFilesDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
/* invoke-direct {v2, v3, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 132 */
v3 = com.umeng.analytics.j .a ( v2 );
if ( v3 != null) { // if-eqz v3, :cond_1
	 /* .line 133 */
	 (( java.io.File ) v2 ).delete ( ); // invoke-virtual {v2}, Ljava/io/File;->delete()Z
	 /* .line 175 */
} // :cond_0
} // :goto_0
/* .line 137 */
} // :cond_1
(( android.content.Context ) p0 ).openFileInput ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_4 */
/* .line 141 */
try { // :try_start_1
com.umeng.analytics.j .a ( v2 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 146 */
try { // :try_start_2
(( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_4 */
/* .line 150 */
try { // :try_start_3
	 /* new-instance v1, Lorg/json/JSONObject; */
	 /* invoke-direct {v1, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
	 /* .line 152 */
	 final String v2 = "cache_version"; // const-string v2, "cache_version"
	 (( org.json.JSONObject ) v1 ).optString ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
	 v2 = 	 (( java.lang.String ) v2 ).equals ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* if-nez v2, :cond_2 */
	 /* .line 153 */
	 final String v2 = "error"; // const-string v2, "error"
	 (( org.json.JSONObject ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
	 /* .line 156 */
} // :cond_2
final String v2 = "cache_version"; // const-string v2, "cache_version"
(( org.json.JSONObject ) v1 ).remove ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->remove(Ljava/lang/String;)Ljava/lang/Object;
/* .line 158 */
(( org.json.JSONObject ) v1 ).length ( ); // invoke-virtual {v1}, Lorg/json/JSONObject;->length()I
/* :try_end_3 */
/* .catch Lorg/json/JSONException; {:try_start_3 ..:try_end_3} :catch_3 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
v2 = /* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_4 */
if ( v2 != null) { // if-eqz v2, :cond_0
	 /* move-object v0, v1 */
	 /* .line 160 */
	 /* .line 142 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 143 */
	 try { // :try_start_4
		 (( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
		 /* :try_end_4 */
		 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
		 /* .line 146 */
		 try { // :try_start_5
			 (( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
			 /* .line 168 */
			 /* :catch_1 */
			 /* move-exception v1 */
			 /* .line 145 */
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* .line 146 */
			 (( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
			 /* .line 147 */
			 /* throw v1 */
			 /* .line 171 */
			 /* :catch_2 */
			 /* move-exception v1 */
			 /* .line 162 */
			 /* :catch_3 */
			 /* move-exception v1 */
			 /* .line 163 */
			 com.umeng.analytics.j .j ( p0 );
			 /* .line 164 */
			 (( org.json.JSONException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
			 /* :try_end_5 */
			 /* .catch Ljava/io/FileNotFoundException; {:try_start_5 ..:try_end_5} :catch_1 */
			 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
			 /* .catch Ljava/lang/Throwable; {:try_start_5 ..:try_end_5} :catch_4 */
			 /* .line 174 */
			 /* :catch_4 */
			 /* move-exception v1 */
		 } // .end method
		 static void a ( android.content.Context p0, Object p1, java.lang.String p2 ) {
			 /* .locals 3 */
			 /* .prologue */
			 /* .line 211 */
			 /* if-nez p1, :cond_0 */
			 /* .line 222 */
		 } // :goto_0
		 return;
		 /* .line 214 */
	 } // :cond_0
	 try { // :try_start_0
		 /* new-instance v0, Lorg/json/JSONObject; */
		 /* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
		 /* .line 215 */
		 /* .line 217 */
		 com.umeng.analytics.j .a ( p0,v0,p2 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 218 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 219 */
		 final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
		 final String v2 = "cache message error"; // const-string v2, "cache message error"
		 com.umeng.common.Log .b ( v1,v2,v0 );
	 } // .end method
	 static void a ( android.content.Context p0, org.json.JSONObject p1, java.lang.String p2 ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/lang/Exception; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 195 */
	 /* if-nez p1, :cond_0 */
	 /* .line 208 */
} // :goto_0
return;
/* .line 197 */
} // :cond_0
com.umeng.analytics.j .g ( p0 );
/* .line 201 */
final String v1 = "cache_version"; // const-string v1, "cache_version"
(( org.json.JSONObject ) p1 ).put ( v1, p2 ); // invoke-virtual {p1, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 202 */
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).openFileOutput ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
/* .line 203 */
(( org.json.JSONObject ) p1 ).toString ( ); // invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( java.lang.String ) v1 ).getBytes ( ); // invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
(( java.io.FileOutputStream ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/FileOutputStream;->write([B)V
/* .line 204 */
(( java.io.FileOutputStream ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/FileOutputStream;->flush()V
/* .line 205 */
(( java.io.FileOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileOutputStream;->close()V
/* .line 207 */
final String v0 = "MobclickAgent"; // const-string v0, "MobclickAgent"
final String v1 = "cache buffer success"; // const-string v1, "cache buffer success"
com.umeng.common.Log .c ( v0,v1 );
} // .end method
static Boolean a ( java.io.File p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 118 */
(( java.io.File ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/io/File;->length()J
/* move-result-wide v0 */
/* .line 120 */
v2 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* sget-wide v2, Lcom/umeng/analytics/j;->b:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_0 */
/* .line 121 */
int v0 = 1; // const/4 v0, 0x1
/* .line 124 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static android.content.SharedPreferences b ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 44 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "mobclick_agent_online_setting_"; // const-string v1, "mobclick_agent_online_setting_"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
} // .end method
static void b ( android.content.Context p0, org.json.JSONObject p1, java.lang.String p2 ) {
/* .locals 3 */
/* .prologue */
/* .line 225 */
/* if-nez p1, :cond_0 */
/* .line 235 */
} // :goto_0
return;
/* .line 229 */
} // :cond_0
try { // :try_start_0
final String v0 = "body"; // const-string v0, "body"
(( org.json.JSONObject ) p1 ).optJSONObject ( v0 ); // invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 230 */
com.umeng.analytics.j .a ( p0,v0,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 231 */
/* :catch_0 */
/* move-exception v0 */
/* .line 232 */
final String v1 = "MobclickAgent"; // const-string v1, "MobclickAgent"
final String v2 = "cache message error"; // const-string v2, "cache message error"
com.umeng.common.Log .b ( v1,v2,v0 );
} // .end method
public static android.content.SharedPreferences c ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 48 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "mobclick_agent_header_"; // const-string v1, "mobclick_agent_header_"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
} // .end method
static android.content.SharedPreferences d ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 52 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "mobclick_agent_update_"; // const-string v1, "mobclick_agent_update_"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
} // .end method
public static android.content.SharedPreferences e ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "mobclick_agent_state_"; // const-string v1, "mobclick_agent_state_"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
} // .end method
static java.lang.String f ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 60 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "mobclick_agent_header_"; // const-string v1, "mobclick_agent_header_"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
static java.lang.String g ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 64 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "mobclick_agent_cached_"; // const-string v1, "mobclick_agent_cached_"
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
static org.json.JSONObject h ( android.content.Context p0 ) {
/* .locals 6 */
/* .prologue */
int v5 = -1; // const/4 v5, -0x1
/* .line 68 */
/* new-instance v0, Lorg/json/JSONObject; */
/* invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V */
/* .line 69 */
com.umeng.analytics.j .a ( p0 );
/* .line 71 */
try { // :try_start_0
final String v2 = "gender"; // const-string v2, "gender"
v2 = int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v5, :cond_0 */
/* .line 72 */
final String v2 = "sex"; // const-string v2, "sex"
final String v3 = "gender"; // const-string v3, "gender"
v3 = int v4 = -1; // const/4 v4, -0x1
(( org.json.JSONObject ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
/* .line 75 */
} // :cond_0
final String v2 = "age"; // const-string v2, "age"
v2 = int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v5, :cond_1 */
/* .line 76 */
final String v2 = "age"; // const-string v2, "age"
final String v3 = "age"; // const-string v3, "age"
v3 = int v4 = -1; // const/4 v4, -0x1
(( org.json.JSONObject ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;
/* .line 79 */
} // :cond_1
final String v2 = ""; // const-string v2, ""
final String v3 = "user_id"; // const-string v3, "user_id"
final String v4 = ""; // const-string v4, ""
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_2 */
/* .line 80 */
final String v2 = "id"; // const-string v2, "id"
final String v3 = "user_id"; // const-string v3, "user_id"
final String v4 = ""; // const-string v4, ""
(( org.json.JSONObject ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 83 */
} // :cond_2
final String v2 = ""; // const-string v2, ""
final String v3 = "id_source"; // const-string v3, "id_source"
final String v4 = ""; // const-string v4, ""
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_3 */
/* .line 84 */
final String v2 = "url"; // const-string v2, "url"
final String v3 = "id_source"; // const-string v3, "id_source"
final String v4 = ""; // const-string v4, ""
final String v3 = "UTF-8"; // const-string v3, "UTF-8"
java.net.URLEncoder .encode ( v1,v3 );
(( org.json.JSONObject ) v0 ).put ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 87 */
} // :cond_3
(( org.json.JSONObject ) v0 ).length ( ); // invoke-virtual {v0}, Lorg/json/JSONObject;->length()I
/* :try_end_0 */
v1 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-lez v1, :cond_4 */
/* .line 92 */
} // :goto_0
/* .line 89 */
/* :catch_0 */
/* move-exception v0 */
/* .line 90 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 92 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static i ( android.content.Context p0 ) {
/* .locals 6 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
int v3 = -1; // const/4 v3, -0x1
int v5 = 1; // const/4 v5, 0x1
/* .line 101 */
com.umeng.analytics.j .b ( p0 );
/* .line 102 */
int v1 = 2; // const/4 v1, 0x2
/* new-array v1, v1, [I */
/* .line 103 */
v2 = final String v2 = "umeng_net_report_policy"; // const-string v2, "umeng_net_report_policy"
/* if-eq v2, v3, :cond_0 */
/* .line 104 */
v2 = final String v2 = "umeng_net_report_policy"; // const-string v2, "umeng_net_report_policy"
/* aput v2, v1, v4 */
/* .line 105 */
final String v2 = "umeng_net_report_interval"; // const-string v2, "umeng_net_report_interval"
/* int-to-long v3, v3 */
/* move-result-wide v2 */
/* long-to-int v0, v2 */
/* aput v0, v1, v5 */
/* .line 111 */
} // :goto_0
/* .line 107 */
} // :cond_0
v2 = final String v2 = "umeng_local_report_policy"; // const-string v2, "umeng_local_report_policy"
/* aput v2, v1, v4 */
/* .line 108 */
final String v2 = "umeng_local_report_interval"; // const-string v2, "umeng_local_report_interval"
/* int-to-long v3, v3 */
/* move-result-wide v2 */
/* long-to-int v0, v2 */
/* aput v0, v1, v5 */
} // .end method
static void j ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 238 */
com.umeng.analytics.j .f ( p0 );
(( android.content.Context ) p0 ).deleteFile ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
/* .line 239 */
com.umeng.analytics.j .g ( p0 );
(( android.content.Context ) p0 ).deleteFile ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
/* .line 240 */
return;
} // .end method
