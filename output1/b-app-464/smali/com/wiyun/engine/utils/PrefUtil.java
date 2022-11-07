public class com.wiyun.engine.utils.PrefUtil {
	 /* # direct methods */
	 public com.wiyun.engine.utils.PrefUtil ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void clear ( ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
		 return;
	 } // .end method
	 public static Boolean getBoolPref ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 v0 = 		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
	 } // .end method
	 public static Integer getIntPref ( java.lang.String p0, Integer p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 v0 = 		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
	 } // .end method
	 public static Long getLongPref ( java.lang.String p0, Long p1 ) {
		 /* .locals 2 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 public static java.lang.String getStringPref ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
	 } // .end method
	 public static void remove ( java.lang.String p0 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
		 return;
	 } // .end method
	 public static void setBoolPref ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
		 return;
	 } // .end method
	 public static void setIntPref ( java.lang.String p0, Integer p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
		 return;
	 } // .end method
	 public static void setLongPref ( java.lang.String p0, Long p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
		 return;
	 } // .end method
	 public static void setStringPref ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 com.wiyun.engine.nodes.Director .getInstance ( );
		 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
		 android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
		 return;
	 } // .end method
