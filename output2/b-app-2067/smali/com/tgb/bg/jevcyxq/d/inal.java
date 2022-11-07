class inal implements android.content.DialogInterface$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 private final android.app.Activity a; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void onClick ( android.content.DialogInterface p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = this.a;
		 (( android.app.Activity ) v0 ).finish ( ); // invoke-virtual {v0}, Landroid/app/Activity;->finish()V
		 return;
	 } // .end method
