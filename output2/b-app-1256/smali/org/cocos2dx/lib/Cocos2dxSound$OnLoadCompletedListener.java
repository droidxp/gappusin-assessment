public class org.cocos2dx.lib.Cocos2dxSound$OnLoadCompletedListener implements android.media.SoundPool$OnLoadCompleteListener {
	 /* .source "Cocos2dxSound.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxSound; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x1 */
/* name = "OnLoadCompletedListener" */
} // .end annotation
/* # instance fields */
final org.cocos2dx.lib.Cocos2dxSound this$0; //synthetic
/* # direct methods */
public org.cocos2dx.lib.Cocos2dxSound$OnLoadCompletedListener ( ) {
/* .locals 0 */
/* .prologue */
/* .line 309 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onLoadComplete ( android.media.SoundPool p0, Integer p1, Integer p2 ) {
/* .locals 6 */
/* .param p1, "soundPool" # Landroid/media/SoundPool; */
/* .param p2, "sampleId" # I */
/* .param p3, "status" # I */
/* .prologue */
/* .line 313 */
/* if-nez p3, :cond_2 */
/* .line 316 */
v1 = this.this$0;
org.cocos2dx.lib.Cocos2dxSound .access$0 ( v1 );
(( java.util.ArrayList ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;
v2 = } // :cond_0
/* if-nez v2, :cond_1 */
/* .line 332 */
} // :goto_0
v1 = this.this$0;
org.cocos2dx.lib.Cocos2dxSound .access$3 ( v1 );
(( java.util.concurrent.Semaphore ) v1 ).release ( ); // invoke-virtual {v1}, Ljava/util/concurrent/Semaphore;->release()V
/* .line 333 */
return;
/* .line 316 */
} // :cond_1
/* check-cast v0, Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted; */
/* .line 317 */
/* .local v0, "info":Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted; */
/* iget v2, v0, Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted;->soundID:I */
/* if-ne p2, v2, :cond_0 */
/* .line 319 */
v1 = this.this$0;
v2 = this.this$0;
v3 = this.path;
/* iget v4, v0, Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted;->soundID:I */
/* iget-boolean v5, v0, Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted;->isLoop:Z */
v2 = org.cocos2dx.lib.Cocos2dxSound .access$1 ( v2,v3,v4,v5 );
org.cocos2dx.lib.Cocos2dxSound .access$2 ( v1,v2 );
/* .line 323 */
v1 = this.this$0;
org.cocos2dx.lib.Cocos2dxSound .access$0 ( v1 );
(( java.util.ArrayList ) v1 ).remove ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 329 */
} // .end local v0 # "info":Lorg/cocos2dx/lib/Cocos2dxSound$SoundInfoForLoadedCompleted;
} // :cond_2
v1 = this.this$0;
int v2 = -1; // const/4 v2, -0x1
org.cocos2dx.lib.Cocos2dxSound .access$2 ( v1,v2 );
} // .end method
