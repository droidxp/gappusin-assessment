public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void a ( android.app.Activity p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* new-instance v0, Landroid/app/AlertDialog$Builder; */
		 /* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 final String v1 = "Error!"; // const-string v1, "Error!"
		 (( android.app.AlertDialog$Builder ) v0 ).setTitle ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 (( android.app.AlertDialog$Builder ) v0 ).setMessage ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 final String v1 = "Ok"; // const-string v1, "Ok"
		 /* new-instance v2, Lcom/tgb/bg/jevcyxq/d/b; */
		 /* invoke-direct {v2, p0}, Lcom/tgb/bg/jevcyxq/d/b;-><init>(Landroid/app/Activity;)V */
		 (( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 (( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
		 return;
	 } // .end method
