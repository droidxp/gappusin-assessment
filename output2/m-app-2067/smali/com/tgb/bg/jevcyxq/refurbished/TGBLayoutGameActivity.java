public abstract class com.tgb.bg.jevcyxq.refurbished.TGBLayoutGameActivity extends org.anddev.andengine.ui.activity.LayoutGameActivity {
	 /* # direct methods */
	 public com.tgb.bg.jevcyxq.refurbished.TGBLayoutGameActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/LayoutGameActivity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected abstract android.view.View n ( ) {
	 } // .end method
	 protected void onDestroy ( ) {
		 /* .locals 3 */
		 /* invoke-super {p0}, Lorg/anddev/andengine/ui/activity/LayoutGameActivity;->onDestroy()V */
		 try { // :try_start_0
			 (( com.tgb.bg.jevcyxq.refurbished.TGBLayoutGameActivity ) p0 ).n ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBLayoutGameActivity;->n()Landroid/view/View;
			 com.tgb.bg.jevcyxq.refurbished.a .a ( v0 );
			 java.lang.System .gc ( );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v0 = "TGB"; // const-string v0, "TGB"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "Some Exception occured in unbinding drawables in onDestroy()->"; // const-string v2, "Some Exception occured in unbinding drawables in onDestroy()->"
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .e ( v0,v1 );
	 } // .end method
