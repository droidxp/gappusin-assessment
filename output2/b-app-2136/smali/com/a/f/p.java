class com.a.f.p extends android.os.Handler {
	 /* # direct methods */
	 com.a.f.p ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void handleMessage ( android.os.Message p0 ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V */
		 /* iget v0, p1, Landroid/os/Message;->what:I */
		 /* packed-switch v0, :pswitch_data_0 */
	 } // :goto_0
	 /* :pswitch_0 */
	 return;
	 /* :pswitch_1 */
	 com.a.f.o .e ( );
	 final String v1 = "\u83b7\u53d6\u670d\u52a1\u5668\u66f4\u65b0\u4fe1\u606f\u5931\u8d25"; // const-string v1, "\u83b7\u53d6\u670d\u52a1\u5668\u66f4\u65b0\u4fe1\u606f\u5931\u8d25"
	 android.widget.Toast .makeText ( v0,v1,v2 );
	 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
	 /* :pswitch_2 */
	 /* sget-boolean v0, Lcom/calmei/jmsn/PlaneFightActivity;->i:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 com.a.f.o .e ( );
		 (( com.calmei.jmsn.PlaneFightActivity ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/calmei/jmsn/PlaneFightActivity;->c()V
	 } // :cond_0
	 com.a.f.o .e ( );
	 final String v1 = "\u66f4\u65b0\u5931\u8d25"; // const-string v1, "\u66f4\u65b0\u5931\u8d25"
	 android.widget.Toast .makeText ( v0,v1,v2 );
	 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
	 /* :pswitch_data_0 */
	 /* .packed-switch 0x0 */
	 /* :pswitch_0 */
	 /* :pswitch_1 */
	 /* :pswitch_2 */
} // .end packed-switch
} // .end method
