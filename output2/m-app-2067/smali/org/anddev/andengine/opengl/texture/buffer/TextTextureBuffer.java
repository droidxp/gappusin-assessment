public class org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer extends org.anddev.andengine.opengl.buffer.BufferObject {
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/opengl/buffer/BufferObject;-><init>(IIZ)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void update ( org.anddev.andengine.opengl.font.Font p0, java.lang.String[] p1 ) {
		 /* .locals 11 */
		 int v10 = 0; // const/4 v10, 0x0
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 (( org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer ) p0 ).getFloatBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer;->getFloatBuffer()Lorg/anddev/andengine/opengl/util/FastFloatBuffer;
			 int v1 = 0; // const/4 v1, 0x0
			 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
			 /* array-length v1, p2 */
			 /* move v2, v10 */
		 } // :goto_0
		 /* if-lt v2, v1, :cond_0 */
		 int v1 = 0; // const/4 v1, 0x0
		 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
		 (( org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer ) p0 ).setHardwareBufferNeedsUpdate ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer;->setHardwareBufferNeedsUpdate()V
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* monitor-exit p0 */
		 return;
	 } // :cond_0
	 try { // :try_start_1
		 /* aget-object v3, p2, v2 */
		 v4 = 		 (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
		 /* move v5, v10 */
	 } // :goto_1
	 /* if-lt v5, v4, :cond_1 */
	 /* add-int/lit8 v2, v2, 0x1 */
} // :cond_1
v6 = (( java.lang.String ) v3 ).charAt ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/String;->charAt(I)C
(( org.anddev.andengine.opengl.font.Font ) p1 ).getLetter ( v6 ); // invoke-virtual {p1, v6}, Lorg/anddev/andengine/opengl/font/Font;->getLetter(C)Lorg/anddev/andengine/opengl/font/Letter;
/* iget v7, v6, Lorg/anddev/andengine/opengl/font/Letter;->mTextureX:F */
/* iget v8, v6, Lorg/anddev/andengine/opengl/font/Letter;->mTextureY:F */
/* iget v9, v6, Lorg/anddev/andengine/opengl/font/Letter;->mTextureWidth:F */
/* add-float/2addr v9, v7 */
/* iget v6, v6, Lorg/anddev/andengine/opengl/font/Letter;->mTextureHeight:F */
/* add-float/2addr v6, v8 */
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v7 ); // invoke-virtual {v0, v7}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v8 ); // invoke-virtual {v0, v8}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v7 ); // invoke-virtual {v0, v7}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v6 ); // invoke-virtual {v0, v6}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v9 ); // invoke-virtual {v0, v9}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v6 ); // invoke-virtual {v0, v6}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v9 ); // invoke-virtual {v0, v9}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v6 ); // invoke-virtual {v0, v6}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v9 ); // invoke-virtual {v0, v9}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v8 ); // invoke-virtual {v0, v8}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v7 ); // invoke-virtual {v0, v7}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v8 ); // invoke-virtual {v0, v8}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put(F)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* add-int/lit8 v5, v5, 0x1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
