public class com.wiyun.engine.utils.PrefUtil {
	 /* .source "PrefUtil.java" */
	 /* # direct methods */
	 public com.wiyun.engine.utils.PrefUtil ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void clear ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 59 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v2 );
		 /* .line 60 */
		 /* .local v1, "p":Landroid/content/SharedPreferences; */
		 /* .line 61 */
		 /* .local v0, "ed":Landroid/content/SharedPreferences$Editor; */
		 /* .line 62 */
		 /* .line 63 */
		 return;
	 } // .end method
	 public static Boolean getBoolPref ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 2 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "def" # Z */
		 /* .prologue */
		 /* .line 47 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v1 );
		 /* .line 48 */
		 v1 = 		 /* .local v0, "p":Landroid/content/SharedPreferences; */
	 } // .end method
	 public static Integer getIntPref ( java.lang.String p0, Integer p1 ) {
		 /* .locals 2 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "def" # I */
		 /* .prologue */
		 /* .line 11 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v1 );
		 /* .line 12 */
		 v1 = 		 /* .local v0, "p":Landroid/content/SharedPreferences; */
	 } // .end method
	 public static Long getLongPref ( java.lang.String p0, Long p1 ) {
		 /* .locals 3 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "def" # J */
		 /* .prologue */
		 /* .line 23 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v1 );
		 /* .line 24 */
		 /* .local v0, "p":Landroid/content/SharedPreferences; */
		 /* move-result-wide v1 */
		 /* return-wide v1 */
	 } // .end method
	 public static java.lang.String getStringPref ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "def" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 35 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v1 );
		 /* .line 36 */
		 /* .local v0, "p":Landroid/content/SharedPreferences; */
	 } // .end method
	 public static void remove ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 66 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v2 );
		 /* .line 67 */
		 /* .local v1, "p":Landroid/content/SharedPreferences; */
		 /* .line 68 */
		 /* .local v0, "ed":Landroid/content/SharedPreferences$Editor; */
		 /* .line 69 */
		 /* .line 70 */
		 return;
	 } // .end method
	 public static void setBoolPref ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 3 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "value" # Z */
		 /* .prologue */
		 /* .line 52 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v2 );
		 /* .line 53 */
		 /* .local v1, "p":Landroid/content/SharedPreferences; */
		 /* .line 54 */
		 /* .local v0, "ed":Landroid/content/SharedPreferences$Editor; */
		 /* .line 55 */
		 /* .line 56 */
		 return;
	 } // .end method
	 public static void setIntPref ( java.lang.String p0, Integer p1 ) {
		 /* .locals 3 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 16 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v2 );
		 /* .line 17 */
		 /* .local v1, "p":Landroid/content/SharedPreferences; */
		 /* .line 18 */
		 /* .local v0, "ed":Landroid/content/SharedPreferences$Editor; */
		 /* .line 19 */
		 /* .line 20 */
		 return;
	 } // .end method
	 public static void setLongPref ( java.lang.String p0, Long p1 ) {
		 /* .locals 3 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "value" # J */
		 /* .prologue */
		 /* .line 28 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v2 );
		 /* .line 29 */
		 /* .local v1, "p":Landroid/content/SharedPreferences; */
		 /* .line 30 */
		 /* .local v0, "ed":Landroid/content/SharedPreferences$Editor; */
		 /* .line 31 */
		 /* .line 32 */
		 return;
	 } // .end method
	 public static void setStringPref ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .param p0, "name" # Ljava/lang/String; */
		 /* .param p1, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 40 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v2 );
		 /* .line 41 */
		 /* .local v1, "p":Landroid/content/SharedPreferences; */
		 /* .line 42 */
		 /* .local v0, "ed":Landroid/content/SharedPreferences$Editor; */
		 /* .line 43 */
		 /* .line 44 */
		 return;
	 } // .end method
