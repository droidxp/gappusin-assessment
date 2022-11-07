public class com.google.ads.af {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public static Boolean a ( android.content.Context p0 ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 24 */
		 /* new-instance v0, Landroid/content/Intent; */
		 /* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
		 /* .line 25 */
		 /* new-instance v1, Landroid/content/ComponentName; */
		 final String v2 = "com.google.android.apps.plus"; // const-string v2, "com.google.android.apps.plus"
		 final String v3 = "com.google.android.apps.circles.platform.PlusOneActivity"; // const-string v3, "com.google.android.apps.circles.platform.PlusOneActivity"
		 /* invoke-direct {v1, v2, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 (( android.content.Intent ) v0 ).setComponent ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
		 /* .line 27 */
		 v0 = 		 com.google.ads.af .a ( v0,p0 );
	 } // .end method
	 public static Boolean a ( android.content.Intent p0, android.content.Context p1 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 37 */
		 (( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 /* .line 38 */
		 /* const/high16 v1, 0x10000 */
		 (( android.content.pm.PackageManager ) v0 ).queryIntentActivities ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
		 v0 = 		 /* .line 40 */
		 /* if-lez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
