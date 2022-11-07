class org.cocos2dx.lib.Cocos2dxSoundMP$1 implements android.media.MediaPlayer$OnCompletionListener {
	 /* .source "Cocos2dxSoundMP.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lorg/cocos2dx/lib/Cocos2dxSoundMP;->createMediaplayerFromAssets(Ljava/lang/String;)Landroid/media/MediaPlayer; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final org.cocos2dx.lib.Cocos2dxSoundMP this$0; //synthetic
/* # direct methods */
 org.cocos2dx.lib.Cocos2dxSoundMP$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 388 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCompletion ( android.media.MediaPlayer p0 ) {
/* .locals 7 */
/* .param p1, "mp" # Landroid/media/MediaPlayer; */
/* .prologue */
/* .line 390 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* const/16 v5, 0x2d */
/* if-lt v1, v5, :cond_1 */
/* .line 411 */
} // :cond_0
} // :goto_1
return;
/* .line 392 */
} // :cond_1
v5 = this.this$0;
org.cocos2dx.lib.Cocos2dxSoundMP .access$0 ( v5 );
/* aget-object v5, v5, v1 */
/* if-ne v5, p1, :cond_3 */
/* .line 394 */
(( android.media.MediaPlayer ) p1 ).release ( ); // invoke-virtual {p1}, Landroid/media/MediaPlayer;->release()V
/* .line 395 */
v5 = this.this$0;
org.cocos2dx.lib.Cocos2dxSoundMP .access$0 ( v5 );
int v6 = 0; // const/4 v6, 0x0
/* aput-object v6, v5, v1 */
/* .line 397 */
v5 = this.this$0;
org.cocos2dx.lib.Cocos2dxSoundMP .access$1 ( v5 );
(( java.util.concurrent.ConcurrentHashMap ) v5 ).entrySet ( ); // invoke-virtual {v5}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;
/* .line 398 */
/* .local v2, "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;" */
v5 = } // :cond_2
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 399 */
/* check-cast v0, Ljava/util/Map$Entry; */
/* .line 400 */
/* .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Integer;>;" */
/* check-cast v3, Ljava/lang/String; */
/* .line 401 */
/* .local v3, "path":Ljava/lang/String; */
/* check-cast v5, Ljava/lang/Integer; */
v4 = (( java.lang.Integer ) v5 ).intValue ( ); // invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I
/* .line 402 */
/* .local v4, "soundId":I */
/* if-ne v1, v4, :cond_2 */
/* .line 404 */
/* .line 390 */
} // .end local v0 # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/Integer;>;"
} // .end local v2 # "iter":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
} // .end local v3 # "path":Ljava/lang/String;
} // .end local v4 # "soundId":I
} // :cond_3
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
