public abstract class org.anddev.andengine.opengl.buffer.BufferObject {
	 /* # static fields */
	 private static final HARDWAREBUFFERID_FETCHER;
	 /* # instance fields */
	 protected final mBufferData;
	 private final Integer mDrawType;
	 protected final org.anddev.andengine.opengl.util.FastFloatBuffer mFloatBuffer;
	 private Integer mHardwareBufferID;
	 private Boolean mHardwareBufferNeedsUpdate;
	 private Boolean mLoadedToHardware;
	 private Boolean mManaged;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.buffer.BufferObject ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.buffer.BufferObject ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferID:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferNeedsUpdate:Z */
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mDrawType:I */
		 /* iput-boolean p3, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mManaged:Z */
		 /* new-array v0, p1, [I */
		 this.mBufferData = v0;
		 /* new-instance v0, Lorg/anddev/andengine/opengl/util/FastFloatBuffer; */
		 /* invoke-direct {v0, p1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;-><init>(I)V */
		 this.mFloatBuffer = v0;
		 if ( p3 != null) { // if-eqz p3, :cond_0
			 (( org.anddev.andengine.opengl.buffer.BufferObject ) p0 ).loadToActiveBufferObjectManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->loadToActiveBufferObjectManager()V
		 } // :cond_0
		 return;
	 } // .end method
	 private void deleteBufferOnHardware ( javax.microedition.khronos.opengles.GL11 p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferID:I */
		 org.anddev.andengine.opengl.util.GLHelper .deleteBuffer ( p1,v0 );
		 return;
	 } // .end method
	 private Integer generateHardwareBufferID ( javax.microedition.khronos.opengles.GL11 p0 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v0 = 1; // const/4 v0, 0x1
		 v1 = org.anddev.andengine.opengl.buffer.BufferObject.HARDWAREBUFFERID_FETCHER;
		 v0 = org.anddev.andengine.opengl.buffer.BufferObject.HARDWAREBUFFERID_FETCHER;
		 /* aget v0, v0, v2 */
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.util.FastFloatBuffer getFloatBuffer ( ) {
		 /* .locals 1 */
		 v0 = this.mFloatBuffer;
	 } // .end method
	 public Integer getHardwareBufferID ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferID:I */
	 } // .end method
	 public Boolean isLoadedToHardware ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mLoadedToHardware:Z */
	 } // .end method
	 public Boolean isManaged ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mManaged:Z */
	 } // .end method
	 public void loadToActiveBufferObjectManager ( ) {
		 /* .locals 1 */
		 org.anddev.andengine.opengl.buffer.BufferObjectManager .getActiveInstance ( );
		 (( org.anddev.andengine.opengl.buffer.BufferObjectManager ) v0 ).loadBufferObject ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->loadBufferObject(Lorg/anddev/andengine/opengl/buffer/BufferObject;)V
		 return;
	 } // .end method
	 public void loadToHardware ( javax.microedition.khronos.opengles.GL11 p0 ) {
		 /* .locals 1 */
		 v0 = 		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->generateHardwareBufferID(Ljavax/microedition/khronos/opengles/GL11;)I */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferID:I */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mLoadedToHardware:Z */
		 return;
	 } // .end method
	 public void selectOnHardware ( javax.microedition.khronos.opengles.GL11 p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferID:I */
		 int v1 = -1; // const/4 v1, -0x1
		 /* if-ne v0, v1, :cond_1 */
	 } // :cond_0
} // :goto_0
return;
} // :cond_1
org.anddev.andengine.opengl.util.GLHelper .bindBuffer ( p1,v0 );
/* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferNeedsUpdate:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferNeedsUpdate:Z */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.mFloatBuffer;
	 v0 = this.mByteBuffer;
	 /* iget v1, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mDrawType:I */
	 org.anddev.andengine.opengl.util.GLHelper .bufferData ( p1,v0,v1 );
	 /* monitor-exit p0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
public void setHardwareBufferNeedsUpdate ( ) {
	 /* .locals 1 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferNeedsUpdate:Z */
	 return;
} // .end method
void setLoadedToHardware ( Boolean p0 ) {
	 /* .locals 0 */
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mLoadedToHardware:Z */
	 return;
} // .end method
public void setManaged ( Boolean p0 ) {
	 /* .locals 0 */
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mManaged:Z */
	 return;
} // .end method
public void unloadFromActiveBufferObjectManager ( ) {
	 /* .locals 1 */
	 org.anddev.andengine.opengl.buffer.BufferObjectManager .getActiveInstance ( );
	 (( org.anddev.andengine.opengl.buffer.BufferObjectManager ) v0 ).unloadBufferObject ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->unloadBufferObject(Lorg/anddev/andengine/opengl/buffer/BufferObject;)V
	 return;
} // .end method
public void unloadFromHardware ( javax.microedition.khronos.opengles.GL11 p0 ) {
	 /* .locals 1 */
	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->deleteBufferOnHardware(Ljavax/microedition/khronos/opengles/GL11;)V */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mHardwareBufferID:I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/buffer/BufferObject;->mLoadedToHardware:Z */
	 return;
} // .end method
