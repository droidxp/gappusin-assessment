class com.mobfox.video.sdk.MobFoxVideoView$7 implements java.lang.Runnable {
	 /* .source "MobFoxVideoView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/mobfox/video/sdk/MobFoxVideoView;->openVideo()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.mobfox.video.sdk.MobFoxVideoView this$0; //synthetic
/* # direct methods */
 com.mobfox.video.sdk.MobFoxVideoView$7 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 167 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 9 */
/* .prologue */
int v8 = 3; // const/4 v8, 0x3
/* .line 170 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
v5 = android.util.Log .isLoggable ( v5,v8 );
if ( v5 != null) { // if-eqz v5, :cond_0
	 /* .line 171 */
	 final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
	 final String v6 = "Time Event Thread started"; // const-string v6, "Time Event Thread started"
	 android.util.Log .d ( v5,v6 );
	 /* .line 174 */
} // :cond_0
v5 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$3 ( v5 );
if ( v5 != null) { // if-eqz v5, :cond_1
	 /* .line 175 */
	 v5 = this.this$0;
	 v5 = 	 com.mobfox.video.sdk.MobFoxVideoView .access$18 ( v5 );
	 /* if-ne v5, v8, :cond_1 */
	 /* .line 177 */
	 try { // :try_start_0
		 v5 = this.this$0;
		 com.mobfox.video.sdk.MobFoxVideoView .access$3 ( v5 );
		 /* .line 178 */
		 v5 = 		 (( android.media.MediaPlayer ) v5 ).getCurrentPosition ( ); // invoke-virtual {v5}, Landroid/media/MediaPlayer;->getCurrentPosition()I
		 /* .line 177 */
		 /* div-int/lit16 v4, v5, 0x3e8 */
		 /* .line 179 */
		 /* .local v4, "time":I */
		 v5 = this.this$0;
		 com.mobfox.video.sdk.MobFoxVideoView .access$19 ( v5 );
		 /* .line 180 */
		 java.lang.Integer .valueOf ( v4 );
		 (( java.util.HashMap ) v5 ).get ( v6 ); // invoke-virtual {v5, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v3, Ljava/util/Vector; */
		 /* .line 181 */
		 /* .local v3, "listeners":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;>;" */
		 if ( v3 != null) { // if-eqz v3, :cond_1
			 /* .line 182 */
			 int v1 = 0; // const/4 v1, 0x0
			 /* .local v1, "i":I */
		 } // :goto_0
		 v5 = 		 (( java.util.Vector ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/Vector;->size()I
		 /* if-lt v1, v5, :cond_2 */
		 /* .line 193 */
		 (( java.util.Vector ) v3 ).clear ( ); // invoke-virtual {v3}, Ljava/util/Vector;->clear()V
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 199 */
	 } // .end local v1 # "i":I
} // .end local v3 # "listeners":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;>;"
} // .end local v4 # "time":I
} // :cond_1
} // :goto_1
v5 = this.this$0;
com.mobfox.video.sdk.MobFoxVideoView .access$20 ( v5 );
/* const-wide/16 v6, 0x3e8 */
v5 = (( android.os.ConditionVariable ) v5 ).block ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Landroid/os/ConditionVariable;->block(J)Z
/* .line 173 */
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 200 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
final String v6 = "Time Event Thread stopped"; // const-string v6, "Time Event Thread stopped"
android.util.Log .v ( v5,v6 );
/* .line 201 */
return;
/* .line 184 */
/* .restart local v1 # "i":I */
/* .restart local v3 # "listeners":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;>;" */
/* .restart local v4 # "time":I */
} // :cond_2
try { // :try_start_1
(( java.util.Vector ) v3 ).elementAt ( v1 ); // invoke-virtual {v3, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener; */
/* .line 185 */
/* .local v2, "l":Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener; */
v5 = this.this$0;
v5 = this.mHandler;
/* new-instance v6, Lcom/mobfox/video/sdk/MobFoxVideoView$7$1; */
/* invoke-direct {v6, p0, v2, v4}, Lcom/mobfox/video/sdk/MobFoxVideoView$7$1;-><init>(Lcom/mobfox/video/sdk/MobFoxVideoView$7;Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;I)V */
(( android.os.Handler ) v5 ).post ( v6 ); // invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 182 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 195 */
} // .end local v1 # "i":I
} // .end local v2 # "l":Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;
} // .end local v3 # "listeners":Ljava/util/Vector;, "Ljava/util/Vector<Lcom/mobfox/video/sdk/MobFoxVideoView$OnTimeEventListener;>;"
} // .end local v4 # "time":I
/* :catch_0 */
/* move-exception v0 */
/* .line 196 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "Time Event Thread error"; // const-string v7, "Time Event Thread error"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v5,v6,v0 );
} // .end method
