public class com.ansca.corona.CoronaRenderer implements android.opengl.GLSurfaceView$Renderer {
	 /* .source "CoronaRenderer.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static Boolean sFirstSurface;
	 /* # instance fields */
	 com.ansca.corona.CoronaActivity fActivity;
	 Boolean fCanRender;
	 /* # direct methods */
	 static com.ansca.corona.CoronaRenderer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 12 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.ansca.corona.CoronaRenderer.sFirstSurface = (v0!= 0);
		 return;
	 } // .end method
	 public com.ansca.corona.CoronaRenderer ( ) {
		 /* .locals 1 */
		 /* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 17 */
		 this.fActivity = p1;
		 /* .line 18 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/ansca/corona/CoronaRenderer;->fCanRender:Z */
		 /* .line 19 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean canRender ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 85 */
		 /* iget-boolean v0, p0, Lcom/ansca/corona/CoronaRenderer;->fCanRender:Z */
	 } // .end method
	 public void clearFirstSurface ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 80 */
		 int v0 = 1; // const/4 v0, 0x1
		 com.ansca.corona.CoronaRenderer.sFirstSurface = (v0!= 0);
		 /* .line 81 */
		 return;
	 } // .end method
	 public void onDrawFrame ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
		 /* .prologue */
		 /* .line 73 */
		 /* iget-boolean v0, p0, Lcom/ansca/corona/CoronaRenderer;->fCanRender:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 74 */
			 com.ansca.corona.Controller .onDrawFrame ( );
			 /* .line 76 */
		 } // :cond_0
		 return;
	 } // .end method
	 public void onSurfaceChanged ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
		 /* .locals 11 */
		 /* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
		 /* .param p2, "w" # I */
		 /* .param p3, "h" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* monitor-enter p0 */
		 /* .line 37 */
		 try { // :try_start_0
			 v0 = this.fActivity;
			 (( com.ansca.corona.CoronaActivity ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getPackageName()Ljava/lang/String;
			 v1 = this.fActivity;
			 (( com.ansca.corona.CoronaActivity ) v1 ).getCoronaDocumentsDir ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CoronaActivity;->getCoronaDocumentsDir()Ljava/io/File;
			 (( java.io.File ) v1 ).getAbsolutePath ( ); // invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
			 v2 = this.fActivity;
			 (( com.ansca.corona.CoronaActivity ) v2 ).getCoronaTemporaryDir ( ); // invoke-virtual {v2}, Lcom/ansca/corona/CoronaActivity;->getCoronaTemporaryDir()Ljava/io/File;
			 (( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
			 v3 = this.fActivity;
			 (( com.ansca.corona.CoronaActivity ) v3 ).getCoronaCachesDir ( ); // invoke-virtual {v3}, Lcom/ansca/corona/CoronaActivity;->getCoronaCachesDir()Ljava/io/File;
			 (( java.io.File ) v3 ).getAbsolutePath ( ); // invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
			 v4 = this.fActivity;
			 (( com.ansca.corona.CoronaActivity ) v4 ).getCoronaSystemCachesDir ( ); // invoke-virtual {v4}, Lcom/ansca/corona/CoronaActivity;->getCoronaSystemCachesDir()Ljava/io/File;
			 (( java.io.File ) v4 ).getAbsolutePath ( ); // invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
			 v5 = this.fActivity;
			 v7 = 			 (( com.ansca.corona.CoronaActivity ) v5 ).getCoronaOrientationOfDisplay ( ); // invoke-virtual {v5}, Lcom/ansca/corona/CoronaActivity;->getCoronaOrientationOfDisplay()I
			 /* move v5, p2 */
			 /* move v6, p3 */
			 /* invoke-static/range {v0 ..v7}, Lcom/ansca/corona/JavaToNativeShim;->resize(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V */
			 /* .line 47 */
			 /* iget-boolean v0, p0, Lcom/ansca/corona/CoronaRenderer;->fCanRender:Z */
			 /* if-nez v0, :cond_0 */
			 /* .line 48 */
			 v0 = this.fActivity;
			 /* new-instance v1, Lcom/ansca/corona/CoronaRenderer$2; */
			 /* invoke-direct {v1, p0}, Lcom/ansca/corona/CoronaRenderer$2;-><init>(Lcom/ansca/corona/CoronaRenderer;)V */
			 (( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
			 /* .line 57 */
		 } // :cond_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/ansca/corona/CoronaRenderer;->fCanRender:Z */
		 /* .line 61 */
		 v0 = this.fActivity;
		 v8 = 		 (( com.ansca.corona.CoronaActivity ) v0 ).getCoronaOrientationOfDisplay ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getCoronaOrientationOfDisplay()I
		 /* .line 62 */
		 /* .local v8, "currentOrientation":I */
		 v0 = this.fActivity;
		 v10 = 		 (( com.ansca.corona.CoronaActivity ) v0 ).getPreviousCoronaOrientationOfDisplay ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getPreviousCoronaOrientationOfDisplay()I
		 /* .line 63 */
		 /* .local v10, "previousOrientation":I */
		 /* if-eq v8, v10, :cond_1 */
		 /* .line 64 */
		 com.ansca.corona.Controller .getEventManager ( );
		 /* .line 65 */
		 /* .local v9, "eventManager":Lcom/ansca/corona/events/EventManager; */
		 if ( v9 != null) { // if-eqz v9, :cond_1
			 /* .line 66 */
			 (( com.ansca.corona.events.EventManager ) v9 ).orientationChanged ( v8, v10 ); // invoke-virtual {v9, v8, v10}, Lcom/ansca/corona/events/EventManager;->orientationChanged(II)V
			 /* .line 69 */
		 } // .end local v9 # "eventManager":Lcom/ansca/corona/events/EventManager;
	 } // :cond_1
	 /* monitor-exit p0 */
	 /* .line 70 */
	 return;
	 /* .line 69 */
} // .end local v8 # "currentOrientation":I
} // .end local v10 # "previousOrientation":I
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void onSurfaceCreated ( javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1 ) {
/* .locals 2 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "config" # Ljavax/microedition/khronos/egl/EGLConfig; */
/* .prologue */
/* .line 22 */
/* sget-boolean v0, Lcom/ansca/corona/CoronaRenderer;->sFirstSurface:Z */
/* if-nez v0, :cond_0 */
/* .line 24 */
v0 = this.fActivity;
/* new-instance v1, Lcom/ansca/corona/CoronaRenderer$1; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/CoronaRenderer$1;-><init>(Lcom/ansca/corona/CoronaRenderer;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 30 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
com.ansca.corona.CoronaRenderer.sFirstSurface = (v0!= 0);
/* .line 31 */
return;
} // .end method
