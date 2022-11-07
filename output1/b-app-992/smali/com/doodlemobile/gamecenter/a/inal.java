class inal extends android.os.Handler {
	 /* # instance fields */
	 private com.doodlemobile.gamecenter.a.f a; //synthetic
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 this.a = p1;
		 /* invoke-direct {p0}, Landroid/os/Handler;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public final void handleMessage ( android.os.Message p0 ) {
		 /* .locals 2 */
		 /* const/16 v0, 0x3021 */
		 (( com.doodlemobile.gamecenter.a.i ) p0 ).removeMessages ( v0 ); // invoke-virtual {p0, v0}, Lcom/doodlemobile/gamecenter/a/i;->removeMessages(I)V
		 com.doodlemobile.gamecenter.a.f .d ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 com.doodlemobile.gamecenter.a.f .d ( );
			 com.doodlemobile.gamecenter.a.f .f ( v0 );
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 com.doodlemobile.gamecenter.a.f .d ( );
				 com.doodlemobile.gamecenter.a.f .f ( v0 );
				 /* const/16 v1, 0x8 */
				 (( com.doodlemobile.gamecenter.a.a ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/a/a;->setVisibility(I)V
			 } // :cond_0
			 return;
		 } // .end method
