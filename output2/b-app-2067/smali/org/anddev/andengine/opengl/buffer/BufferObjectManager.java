public class org.anddev.andengine.opengl.buffer.BufferObjectManager {
	 /* # static fields */
	 private static org.anddev.andengine.opengl.buffer.BufferObjectManager mActiveInstance;
	 private static final java.util.ArrayList mBufferObjectsLoaded;
	 private static final java.util.HashSet mBufferObjectsManaged;
	 private static final java.util.ArrayList mBufferObjectsToBeLoaded;
	 private static final java.util.ArrayList mBufferObjectsToBeUnloaded;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.buffer.BufferObjectManager ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Ljava/util/HashSet; */
		 /* invoke-direct {v0}, Ljava/util/HashSet;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.buffer.BufferObjectManager ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.buffer.BufferObjectManager getActiveInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mActiveInstance;
	 } // .end method
	 public static void setActiveInstance ( org.anddev.andengine.opengl.buffer.BufferObjectManager p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void clear ( ) {
		 /* .locals 1 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsToBeLoaded;
			 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
			 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsLoaded;
			 (( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
			 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsManaged;
			 (( java.util.HashSet ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashSet;->clear()V
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
		 public synchronized void loadBufferObject ( org.anddev.andengine.opengl.buffer.BufferObject p0 ) {
			 /* .locals 1 */
			 /* monitor-enter p0 */
			 /* if-nez p1, :cond_0 */
		 } // :goto_0
		 /* monitor-exit p0 */
		 return;
	 } // :cond_0
	 try { // :try_start_0
		 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsManaged;
		 v0 = 		 (( java.util.HashSet ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsToBeUnloaded;
			 (( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // :cond_1
		 try { // :try_start_1
			 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsManaged;
			 (( java.util.HashSet ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
			 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsToBeLoaded;
			 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
			 /* :try_end_1 */
			 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 } // .end method
		 public void loadBufferObjects ( org.anddev.andengine.opengl.buffer.BufferObject...p0 ) {
			 /* .locals 2 */
			 /* array-length v0, p1 */
			 int v1 = 1; // const/4 v1, 0x1
			 /* sub-int/2addr v0, v1 */
		 } // :goto_0
		 /* if-gez v0, :cond_0 */
		 return;
	 } // :cond_0
	 /* aget-object v1, p1, v0 */
	 (( org.anddev.andengine.opengl.buffer.BufferObjectManager ) p0 ).loadBufferObject ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->loadBufferObject(Lorg/anddev/andengine/opengl/buffer/BufferObject;)V
	 /* add-int/lit8 v0, v0, -0x1 */
} // .end method
public synchronized void reloadBufferObjects ( ) {
	 /* .locals 4 */
	 /* monitor-enter p0 */
	 try { // :try_start_0
		 v1 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsLoaded;
		 v0 = 		 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* sub-int/2addr v0, v2 */
		 /* move v2, v0 */
	 } // :goto_0
	 /* if-gez v2, :cond_0 */
	 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsToBeLoaded;
	 (( java.util.ArrayList ) v0 ).addAll ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
	 (( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* monitor-exit p0 */
	 return;
} // :cond_0
try { // :try_start_1
	 (( java.util.ArrayList ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
	 /* check-cast v0, Lorg/anddev/andengine/opengl/buffer/BufferObject; */
	 int v3 = 0; // const/4 v3, 0x0
	 (( org.anddev.andengine.opengl.buffer.BufferObject ) v0 ).setLoadedToHardware ( v3 ); // invoke-virtual {v0, v3}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->setLoadedToHardware(Z)V
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* add-int/lit8 v0, v2, -0x1 */
	 /* move v2, v0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // .end method
public synchronized void unloadBufferObject ( org.anddev.andengine.opengl.buffer.BufferObject p0 ) {
	 /* .locals 1 */
	 /* monitor-enter p0 */
	 /* if-nez p1, :cond_1 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_1
try { // :try_start_0
v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsManaged;
v0 = (( java.util.HashSet ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsLoaded;
v0 = (( java.util.ArrayList ) v0 ).contains ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
	 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsToBeUnloaded;
	 (( java.util.ArrayList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // :cond_2
try { // :try_start_1
	 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsToBeLoaded;
	 v0 = 	 (( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsManaged;
		 (( java.util.HashSet ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 } // .end method
	 public void unloadBufferObjects ( org.anddev.andengine.opengl.buffer.BufferObject...p0 ) {
		 /* .locals 2 */
		 /* array-length v0, p1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* sub-int/2addr v0, v1 */
	 } // :goto_0
	 /* if-gez v0, :cond_0 */
	 return;
} // :cond_0
/* aget-object v1, p1, v0 */
(( org.anddev.andengine.opengl.buffer.BufferObjectManager ) p0 ).unloadBufferObject ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->unloadBufferObject(Lorg/anddev/andengine/opengl/buffer/BufferObject;)V
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
public synchronized void updateBufferObjects ( javax.microedition.khronos.opengles.GL11 p0 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
/* monitor-enter p0 */
try { // :try_start_0
	 v1 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsManaged;
	 v2 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsLoaded;
	 v3 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsToBeLoaded;
	 v4 = org.anddev.andengine.opengl.buffer.BufferObjectManager.mBufferObjectsToBeUnloaded;
	 v0 = 	 (( java.util.ArrayList ) v3 ).size ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
	 /* if-lez v0, :cond_0 */
	 /* sub-int/2addr v0, v7 */
	 /* move v5, v0 */
} // :goto_0
/* if-gez v5, :cond_2 */
(( java.util.ArrayList ) v3 ).clear ( ); // invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
} // :cond_0
(( java.util.ArrayList ) v4 ).size ( ); // invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-lez v0, :cond_1 */
/* sub-int/2addr v0, v7 */
/* move v3, v0 */
} // :goto_1
/* if-gez v3, :cond_4 */
} // :cond_1
/* monitor-exit p0 */
return;
} // :cond_2
try { // :try_start_1
(( java.util.ArrayList ) v3 ).get ( v5 ); // invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/buffer/BufferObject; */
v6 = (( org.anddev.andengine.opengl.buffer.BufferObject ) v0 ).isLoadedToHardware ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->isLoadedToHardware()Z
/* if-nez v6, :cond_3 */
(( org.anddev.andengine.opengl.buffer.BufferObject ) v0 ).loadToHardware ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->loadToHardware(Ljavax/microedition/khronos/opengles/GL11;)V
(( org.anddev.andengine.opengl.buffer.BufferObject ) v0 ).setHardwareBufferNeedsUpdate ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->setHardwareBufferNeedsUpdate()V
} // :cond_3
(( java.util.ArrayList ) v2 ).add ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* add-int/lit8 v0, v5, -0x1 */
/* move v5, v0 */
} // :cond_4
(( java.util.ArrayList ) v4 ).remove ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/buffer/BufferObject; */
v5 = (( org.anddev.andengine.opengl.buffer.BufferObject ) v0 ).isLoadedToHardware ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->isLoadedToHardware()Z
if ( v5 != null) { // if-eqz v5, :cond_5
(( org.anddev.andengine.opengl.buffer.BufferObject ) v0 ).unloadFromHardware ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->unloadFromHardware(Ljavax/microedition/khronos/opengles/GL11;)V
} // :cond_5
(( java.util.ArrayList ) v2 ).remove ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
(( java.util.HashSet ) v1 ).remove ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* add-int/lit8 v0, v3, -0x1 */
/* move v3, v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
