public abstract class com.tgb.bg.jevcyxq.refurbished.l extends android.app.Dialog implements android.content.DialogInterface$OnDismissListener {
	 /* # interfaces */
	 /* # direct methods */
	 public com.tgb.bg.jevcyxq.refurbished.l ( ) {
		 /* .locals 1 */
		 /* const v0, 0x1030011 */
		 /* invoke-direct {p0, p1, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected abstract android.view.View a ( ) {
	 } // .end method
	 public void onDismiss ( android.content.DialogInterface p0 ) {
		 /* .locals 1 */
		 try { // :try_start_0
			 (( com.tgb.bg.jevcyxq.refurbished.l ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/l;->a()Landroid/view/View;
			 com.tgb.bg.jevcyxq.refurbished.a .a ( v0 );
			 java.lang.System .gc ( );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
