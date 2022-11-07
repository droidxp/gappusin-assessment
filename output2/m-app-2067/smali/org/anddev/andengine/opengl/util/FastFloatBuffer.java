public class org.anddev.andengine.opengl.util.FastFloatBuffer {
	 /* # static fields */
	 private static java.lang.ref.SoftReference sWeakIntArray;
	 /* # instance fields */
	 public final java.nio.ByteBuffer mByteBuffer;
	 private final java.nio.FloatBuffer mFloatBuffer;
	 private final java.nio.IntBuffer mIntBuffer;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.util.FastFloatBuffer ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/ref/SoftReference; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-array v1, v1, [I */
		 /* invoke-direct {v0, v1}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.util.FastFloatBuffer ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* mul-int/lit8 v0, p1, 0x4 */
		 java.nio.ByteBuffer .allocateDirect ( v0 );
		 java.nio.ByteOrder .nativeOrder ( );
		 (( java.nio.ByteBuffer ) v0 ).order ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
		 this.mByteBuffer = v0;
		 v0 = this.mByteBuffer;
		 (( java.nio.ByteBuffer ) v0 ).asFloatBuffer ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asFloatBuffer()Ljava/nio/FloatBuffer;
		 this.mFloatBuffer = v0;
		 v0 = this.mByteBuffer;
		 (( java.nio.ByteBuffer ) v0 ).asIntBuffer ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;
		 this.mIntBuffer = v0;
		 return;
	 } // .end method
	 public static convert ( Float...p0 ) {
		 /* .locals 4 */
		 /* array-length v0, p0 */
		 /* new-array v1, v0, [I */
		 int v2 = 0; // const/4 v2, 0x0
	 } // :goto_0
	 /* if-lt v2, v0, :cond_0 */
} // :cond_0
/* aget v3, p0, v2 */
v3 = java.lang.Float .floatToRawIntBits ( v3 );
/* aput v3, v1, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
/* # virtual methods */
public Integer capacity ( ) {
/* .locals 1 */
v0 = this.mFloatBuffer;
v0 = (( java.nio.FloatBuffer ) v0 ).capacity ( ); // invoke-virtual {v0}, Ljava/nio/FloatBuffer;->capacity()I
} // .end method
public void clear ( ) {
/* .locals 1 */
v0 = this.mByteBuffer;
(( java.nio.ByteBuffer ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;
v0 = this.mFloatBuffer;
(( java.nio.FloatBuffer ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/nio/FloatBuffer;->clear()Ljava/nio/Buffer;
v0 = this.mIntBuffer;
(( java.nio.IntBuffer ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/nio/IntBuffer;->clear()Ljava/nio/Buffer;
return;
} // .end method
public void flip ( ) {
/* .locals 1 */
v0 = this.mByteBuffer;
(( java.nio.ByteBuffer ) v0 ).flip ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;
v0 = this.mFloatBuffer;
(( java.nio.FloatBuffer ) v0 ).flip ( ); // invoke-virtual {v0}, Ljava/nio/FloatBuffer;->flip()Ljava/nio/Buffer;
v0 = this.mIntBuffer;
(( java.nio.IntBuffer ) v0 ).flip ( ); // invoke-virtual {v0}, Ljava/nio/IntBuffer;->flip()Ljava/nio/Buffer;
return;
} // .end method
public Integer limit ( ) {
/* .locals 1 */
v0 = this.mFloatBuffer;
v0 = (( java.nio.FloatBuffer ) v0 ).limit ( ); // invoke-virtual {v0}, Ljava/nio/FloatBuffer;->limit()I
} // .end method
public Integer position ( ) {
/* .locals 1 */
v0 = this.mFloatBuffer;
v0 = (( java.nio.FloatBuffer ) v0 ).position ( ); // invoke-virtual {v0}, Ljava/nio/FloatBuffer;->position()I
} // .end method
public void position ( Integer p0 ) {
/* .locals 2 */
v0 = this.mByteBuffer;
/* mul-int/lit8 v1, p1, 0x4 */
(( java.nio.ByteBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
v0 = this.mFloatBuffer;
(( java.nio.FloatBuffer ) v0 ).position ( p1 ); // invoke-virtual {v0, p1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;
v0 = this.mIntBuffer;
(( java.nio.IntBuffer ) v0 ).position ( p1 ); // invoke-virtual {v0, p1}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;
return;
} // .end method
public void put ( Float p0 ) {
/* .locals 3 */
v0 = this.mByteBuffer;
v1 = this.mIntBuffer;
v2 = (( java.nio.ByteBuffer ) v0 ).position ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I
/* add-int/lit8 v2, v2, 0x4 */
(( java.nio.ByteBuffer ) v0 ).position ( v2 ); // invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
v0 = this.mFloatBuffer;
(( java.nio.FloatBuffer ) v0 ).put ( p1 ); // invoke-virtual {v0, p1}, Ljava/nio/FloatBuffer;->put(F)Ljava/nio/FloatBuffer;
v0 = (( java.nio.IntBuffer ) v1 ).position ( ); // invoke-virtual {v1}, Ljava/nio/IntBuffer;->position()I
/* add-int/lit8 v0, v0, 0x1 */
(( java.nio.IntBuffer ) v1 ).position ( v0 ); // invoke-virtual {v1, v0}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;
return;
} // .end method
public void put ( org.anddev.andengine.opengl.util.FastFloatBuffer p0 ) {
/* .locals 3 */
v0 = this.mByteBuffer;
v1 = this.mByteBuffer;
(( java.nio.ByteBuffer ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
v1 = this.mFloatBuffer;
v2 = (( java.nio.ByteBuffer ) v0 ).position ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I
/* shr-int/lit8 v2, v2, 0x2 */
(( java.nio.FloatBuffer ) v1 ).position ( v2 ); // invoke-virtual {v1, v2}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;
v1 = this.mIntBuffer;
v0 = (( java.nio.ByteBuffer ) v0 ).position ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I
/* shr-int/lit8 v0, v0, 0x2 */
(( java.nio.IntBuffer ) v1 ).position ( v0 ); // invoke-virtual {v1, v0}, Ljava/nio/IntBuffer;->position(I)Ljava/nio/Buffer;
return;
} // .end method
public void put ( Float[] p0 ) {
/* .locals 6 */
int v5 = 0; // const/4 v5, 0x0
/* array-length v1, p1 */
v0 = org.anddev.andengine.opengl.util.FastFloatBuffer.sWeakIntArray;
(( java.lang.ref.SoftReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;
/* check-cast v0, [I */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* array-length v2, v0 */
	 /* if-ge v2, v1, :cond_1 */
} // :cond_0
/* new-array v0, v1, [I */
/* new-instance v2, Ljava/lang/ref/SoftReference; */
/* invoke-direct {v2, v0}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;)V */
} // :cond_1
/* move v2, v5 */
} // :goto_0
/* if-lt v2, v1, :cond_2 */
v2 = this.mByteBuffer;
v3 = (( java.nio.ByteBuffer ) v2 ).position ( ); // invoke-virtual {v2}, Ljava/nio/ByteBuffer;->position()I
/* mul-int/lit8 v4, v1, 0x4 */
/* add-int/2addr v3, v4 */
(( java.nio.ByteBuffer ) v2 ).position ( v3 ); // invoke-virtual {v2, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
v2 = this.mFloatBuffer;
v3 = (( java.nio.FloatBuffer ) v2 ).position ( ); // invoke-virtual {v2}, Ljava/nio/FloatBuffer;->position()I
/* add-int/2addr v3, v1 */
(( java.nio.FloatBuffer ) v2 ).position ( v3 ); // invoke-virtual {v2, v3}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;
v2 = this.mIntBuffer;
(( java.nio.IntBuffer ) v2 ).put ( v0, v5, v1 ); // invoke-virtual {v2, v0, v5, v1}, Ljava/nio/IntBuffer;->put([III)Ljava/nio/IntBuffer;
return;
} // :cond_2
/* aget v3, p1, v2 */
v3 = java.lang.Float .floatToRawIntBits ( v3 );
/* aput v3, v0, v2 */
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
public void put ( Integer[] p0 ) {
/* .locals 3 */
v0 = this.mByteBuffer;
v1 = (( java.nio.ByteBuffer ) v0 ).position ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->position()I
/* array-length v2, p1 */
/* mul-int/lit8 v2, v2, 0x4 */
/* add-int/2addr v1, v2 */
(( java.nio.ByteBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;
v0 = this.mFloatBuffer;
v1 = (( java.nio.FloatBuffer ) v0 ).position ( ); // invoke-virtual {v0}, Ljava/nio/FloatBuffer;->position()I
/* array-length v2, p1 */
/* add-int/2addr v1, v2 */
(( java.nio.FloatBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/FloatBuffer;->position(I)Ljava/nio/Buffer;
v0 = this.mIntBuffer;
int v1 = 0; // const/4 v1, 0x0
/* array-length v2, p1 */
(( java.nio.IntBuffer ) v0 ).put ( p1, v1, v2 ); // invoke-virtual {v0, p1, v1, v2}, Ljava/nio/IntBuffer;->put([III)Ljava/nio/IntBuffer;
return;
} // .end method
public Integer remaining ( ) {
/* .locals 1 */
v0 = this.mFloatBuffer;
v0 = (( java.nio.FloatBuffer ) v0 ).remaining ( ); // invoke-virtual {v0}, Ljava/nio/FloatBuffer;->remaining()I
} // .end method
public java.nio.FloatBuffer slice ( ) {
/* .locals 1 */
v0 = this.mFloatBuffer;
(( java.nio.FloatBuffer ) v0 ).slice ( ); // invoke-virtual {v0}, Ljava/nio/FloatBuffer;->slice()Ljava/nio/FloatBuffer;
} // .end method
