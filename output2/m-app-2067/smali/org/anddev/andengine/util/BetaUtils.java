public class org.anddev.andengine.util.BetaUtils implements org.anddev.andengine.util.constants.Constants {
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String PREFERENCES_BETAUTILS_ID;
	 /* # direct methods */
	 public org.anddev.andengine.util.BetaUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean finishWhenExpired ( android.app.Activity p0, java.util.GregorianCalendar p1, Integer p2, Integer p3 ) {
		 /* .locals 6 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move-object v5, v4 */
		 v0 = 		 /* invoke-static/range {v0 ..v5}, Lorg/anddev/andengine/util/BetaUtils;->finishWhenExpired(Landroid/app/Activity;Ljava/util/GregorianCalendar;IILandroid/content/Intent;Landroid/content/Intent;)Z */
	 } // .end method
	 public static Boolean finishWhenExpired ( android.app.Activity p0, java.util.GregorianCalendar p1, Integer p2, Integer p3, android.content.Intent p4, android.content.Intent p5 ) {
		 /* .locals 6 */
		 org.anddev.andengine.util.SimplePreferences .getInstance ( p0 );
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v1 */
		 final String v3 = "preferences.betautils.lastuse"; // const-string v3, "preferences.betautils.lastuse"
		 /* const-wide/16 v4, -0x1 */
		 /* move-result-wide v3 */
		 java.lang.Math .max ( v1,v2,v3,v4 );
		 /* move-result-wide v1 */
		 final String v3 = "preferences.betautils.lastuse"; // const-string v3, "preferences.betautils.lastuse"
		 /* new-instance v0, Ljava/util/GregorianCalendar; */
		 /* invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V */
		 (( java.util.GregorianCalendar ) v0 ).setTimeInMillis ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/GregorianCalendar;->setTimeInMillis(J)V
		 v0 = 		 (( java.util.GregorianCalendar ) v0 ).after ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/GregorianCalendar;->after(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* new-instance v0, Landroid/app/AlertDialog$Builder; */
			 /* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
			 (( android.app.AlertDialog$Builder ) v0 ).setTitle ( p2 ); // invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;
			 /* const v1, 0x1080027 */
			 (( android.app.AlertDialog$Builder ) v0 ).setIcon ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setIcon(I)Landroid/app/AlertDialog$Builder;
			 (( android.app.AlertDialog$Builder ) v0 ).setMessage ( p3 ); // invoke-virtual {v0, p3}, Landroid/app/AlertDialog$Builder;->setMessage(I)Landroid/app/AlertDialog$Builder;
			 /* const v1, 0x104000a */
			 /* new-instance v2, Lorg/anddev/andengine/util/BetaUtils$1; */
			 /* invoke-direct {v2, p4, p0}, Lorg/anddev/andengine/util/BetaUtils$1;-><init>(Landroid/content/Intent;Landroid/app/Activity;)V */
			 (( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
			 /* const/high16 v1, 0x1040000 */
			 /* new-instance v2, Lorg/anddev/andengine/util/BetaUtils$2; */
			 /* invoke-direct {v2, p5, p0}, Lorg/anddev/andengine/util/BetaUtils$2;-><init>(Landroid/content/Intent;Landroid/app/Activity;)V */
			 (( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
			 (( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
			 (( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
