class com.wiyun.engine.sound.AudioManager$2 implements android.media.MediaPlayer$OnPreparedListener {
	 /* # interfaces */
	 /* # direct methods */
	 com.wiyun.engine.sound.AudioManager$2 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onPrepared ( android.media.MediaPlayer p0 ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.wiyun.engine.sound.AudioManager .access$4 ( v0 );
		 v0 = 		 com.wiyun.engine.sound.AudioManager .access$5 ( );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 com.wiyun.engine.sound.AudioManager .access$2 ( );
			 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
		 } // :cond_0
		 return;
	 } // .end method
