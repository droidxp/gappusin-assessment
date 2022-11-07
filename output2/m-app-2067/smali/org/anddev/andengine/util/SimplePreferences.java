public class org.anddev.andengine.util.SimplePreferences implements org.anddev.andengine.util.constants.Constants {
	 /* # interfaces */
	 /* # static fields */
	 private static android.content.SharedPreferences$Editor EDITORINSTANCE;
	 private static android.content.SharedPreferences INSTANCE;
	 /* # direct methods */
	 public org.anddev.andengine.util.SimplePreferences ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer getAccessCount ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 org.anddev.andengine.util.SimplePreferences .getInstance ( p0 );
		 v0 = 		 int v1 = 0; // const/4 v1, 0x0
	 } // .end method
	 public static android.content.SharedPreferences$Editor getEditorInstance ( android.content.Context p0 ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.util.SimplePreferences.EDITORINSTANCE;
		 /* if-nez v0, :cond_0 */
		 org.anddev.andengine.util.SimplePreferences .getInstance ( p0 );
	 } // :cond_0
	 v0 = org.anddev.andengine.util.SimplePreferences.EDITORINSTANCE;
} // .end method
public static android.content.SharedPreferences getInstance ( android.content.Context p0 ) {
	 /* .locals 1 */
	 v0 = org.anddev.andengine.util.SimplePreferences.INSTANCE;
	 /* if-nez v0, :cond_0 */
	 android.preference.PreferenceManager .getDefaultSharedPreferences ( p0 );
} // :cond_0
v0 = org.anddev.andengine.util.SimplePreferences.INSTANCE;
} // .end method
public static Integer incrementAccessCount ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
v0 = org.anddev.andengine.util.SimplePreferences .incrementAccessCount ( p0,p1,v0 );
} // .end method
public static Integer incrementAccessCount ( android.content.Context p0, java.lang.String p1, Integer p2 ) {
/* .locals 2 */
org.anddev.andengine.util.SimplePreferences .getInstance ( p0 );
v1 = int v1 = 0; // const/4 v1, 0x0
/* add-int/2addr v1, p2 */
} // .end method
