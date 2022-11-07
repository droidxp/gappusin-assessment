public class org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer extends org.anddev.andengine.opengl.vertex.VertexBuffer {
	 /* # static fields */
	 private static final org.anddev.andengine.util.Transformation TRANSFORATION_TMP;
	 public static final Integer VERTICES_PER_RECTANGLE;
	 private static final VERTICES_TMP;
	 /* # instance fields */
	 private Integer mIndex;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x8 */
		 /* new-array v0, v0, [F */
		 /* new-instance v0, Lorg/anddev/andengine/util/Transformation; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/Transformation;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ( ) {
		 /* .locals 1 */
		 /* mul-int/lit8 v0, p1, 0x2 */
		 /* mul-int/lit8 v0, v0, 0x6 */
		 /* invoke-direct {p0, v0, p2, p3}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;-><init>(IIZ)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 2 */
		 /* add-float v0, p1, p3 */
		 /* add-float v1, p2, p4 */
		 (( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) p0 ).addInner ( p1, p2, v0, v1 ); // invoke-virtual {p0, p1, p2, v0, v1}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->addInner(FFFF)V
		 return;
	 } // .end method
	 public void add ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
		 /* .locals 5 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* mul-float v0, p3, v1 */
		 /* mul-float/2addr v1, p4 */
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).setToIdentity ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/util/Transformation;->setToIdentity()V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 /* neg-float v3, v0 */
		 /* neg-float v4, v1 */
		 (( org.anddev.andengine.util.Transformation ) v2 ).postTranslate ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).postRotate ( p5 ); // invoke-virtual {v2, p5}, Lorg/anddev/andengine/util/Transformation;->postRotate(F)V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).postTranslate ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) p0 ).add ( p3, p4, v0 ); // invoke-virtual {p0, p3, p4, v0}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFLorg/anddev/andengine/util/Transformation;)V
		 return;
	 } // .end method
	 public void add ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
		 /* .locals 5 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* mul-float v0, p3, v1 */
		 /* mul-float/2addr v1, p4 */
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).setToIdentity ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/util/Transformation;->setToIdentity()V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 /* neg-float v3, v0 */
		 /* neg-float v4, v1 */
		 (( org.anddev.andengine.util.Transformation ) v2 ).postTranslate ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).postScale ( p5, p6 ); // invoke-virtual {v2, p5, p6}, Lorg/anddev/andengine/util/Transformation;->postScale(FF)V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).postTranslate ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) p0 ).add ( p3, p4, v0 ); // invoke-virtual {p0, p3, p4, v0}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFLorg/anddev/andengine/util/Transformation;)V
		 return;
	 } // .end method
	 public void add ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
		 /* .locals 5 */
		 /* const/high16 v1, 0x3f000000 # 0.5f */
		 /* mul-float v0, p3, v1 */
		 /* mul-float/2addr v1, p4 */
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).setToIdentity ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/util/Transformation;->setToIdentity()V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 /* neg-float v3, v0 */
		 /* neg-float v4, v1 */
		 (( org.anddev.andengine.util.Transformation ) v2 ).postTranslate ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).postScale ( p6, p7 ); // invoke-virtual {v2, p6, p7}, Lorg/anddev/andengine/util/Transformation;->postScale(FF)V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).postRotate ( p5 ); // invoke-virtual {v2, p5}, Lorg/anddev/andengine/util/Transformation;->postRotate(F)V
		 v2 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v2 ).postTranslate ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.util.Transformation ) v0 ).postTranslate ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lorg/anddev/andengine/util/Transformation;->postTranslate(FF)V
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.TRANSFORATION_TMP;
		 (( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) p0 ).add ( p3, p4, v0 ); // invoke-virtual {p0, p3, p4, v0}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFLorg/anddev/andengine/util/Transformation;)V
		 return;
	 } // .end method
	 public void add ( Float p0, Float p1, org.anddev.andengine.util.Transformation p2 ) {
		 /* .locals 9 */
		 int v6 = 3; // const/4 v6, 0x3
		 int v5 = 2; // const/4 v5, 0x2
		 int v4 = 1; // const/4 v4, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 /* aput v2, v0, v3 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 /* aput v2, v0, v4 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 /* aput v2, v0, v5 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 /* aput p2, v0, v6 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 int v1 = 4; // const/4 v1, 0x4
		 /* aput p1, v0, v1 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 int v1 = 5; // const/4 v1, 0x5
		 /* aput v2, v0, v1 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 int v1 = 6; // const/4 v1, 0x6
		 /* aput p1, v0, v1 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 int v1 = 7; // const/4 v1, 0x7
		 /* aput p2, v0, v1 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 (( org.anddev.andengine.util.Transformation ) p3 ).transform ( v0 ); // invoke-virtual {p3, v0}, Lorg/anddev/andengine/util/Transformation;->transform([F)V
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 /* aget v1, v0, v3 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 /* aget v2, v0, v4 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 /* aget v3, v0, v5 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 /* aget v4, v0, v6 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 int v5 = 4; // const/4 v5, 0x4
		 /* aget v5, v0, v5 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 int v6 = 5; // const/4 v6, 0x5
		 /* aget v6, v0, v6 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 int v7 = 6; // const/4 v7, 0x6
		 /* aget v7, v0, v7 */
		 v0 = org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer.VERTICES_TMP;
		 int v8 = 7; // const/4 v8, 0x7
		 /* aget v8, v0, v8 */
		 /* move-object v0, p0 */
		 /* invoke-virtual/range {v0 ..v8}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->addInner(FFFFFFFF)V */
		 return;
	 } // .end method
	 public void addInner ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 7 */
		 v0 = 		 java.lang.Float .floatToRawIntBits ( p1 );
		 v1 = 		 java.lang.Float .floatToRawIntBits ( p2 );
		 v2 = 		 java.lang.Float .floatToRawIntBits ( p3 );
		 v3 = 		 java.lang.Float .floatToRawIntBits ( p4 );
		 v4 = this.mBufferData;
		 /* iget v5, p0, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->mIndex:I */
		 /* add-int/lit8 v6, v5, 0x1 */
		 /* aput v0, v4, v5 */
		 /* add-int/lit8 v5, v6, 0x1 */
		 /* aput v1, v4, v6 */
		 /* add-int/lit8 v6, v5, 0x1 */
		 /* aput v0, v4, v5 */
		 /* add-int/lit8 v5, v6, 0x1 */
		 /* aput v3, v4, v6 */
		 /* add-int/lit8 v6, v5, 0x1 */
		 /* aput v2, v4, v5 */
		 /* add-int/lit8 v5, v6, 0x1 */
		 /* aput v1, v4, v6 */
		 /* add-int/lit8 v6, v5, 0x1 */
		 /* aput v2, v4, v5 */
		 /* add-int/lit8 v5, v6, 0x1 */
		 /* aput v1, v4, v6 */
		 /* add-int/lit8 v1, v5, 0x1 */
		 /* aput v0, v4, v5 */
		 /* add-int/lit8 v0, v1, 0x1 */
		 /* aput v3, v4, v1 */
		 /* add-int/lit8 v1, v0, 0x1 */
		 /* aput v2, v4, v0 */
		 /* add-int/lit8 v0, v1, 0x1 */
		 /* aput v3, v4, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->mIndex:I */
		 return;
	 } // .end method
	 public void addInner ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
		 /* .locals 11 */
		 v0 = 		 java.lang.Float .floatToRawIntBits ( p1 );
		 v1 = 		 java.lang.Float .floatToRawIntBits ( p2 );
		 v2 = 		 java.lang.Float .floatToRawIntBits ( p3 );
		 v3 = 		 java.lang.Float .floatToRawIntBits ( p4 );
		 v4 = 		 /* invoke-static/range {p5 ..p5}, Ljava/lang/Float;->floatToRawIntBits(F)I */
		 v5 = 		 /* invoke-static/range {p6 ..p6}, Ljava/lang/Float;->floatToRawIntBits(F)I */
		 v6 = 		 /* invoke-static/range {p7 ..p7}, Ljava/lang/Float;->floatToRawIntBits(F)I */
		 v7 = 		 /* invoke-static/range {p8 ..p8}, Ljava/lang/Float;->floatToRawIntBits(F)I */
		 v8 = this.mBufferData;
		 /* iget v9, p0, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->mIndex:I */
		 /* add-int/lit8 v10, v9, 0x1 */
		 /* aput v0, v8, v9 */
		 /* add-int/lit8 v0, v10, 0x1 */
		 /* aput v1, v8, v10 */
		 /* add-int/lit8 v1, v0, 0x1 */
		 /* aput v2, v8, v0 */
		 /* add-int/lit8 v0, v1, 0x1 */
		 /* aput v3, v8, v1 */
		 /* add-int/lit8 v1, v0, 0x1 */
		 /* aput v4, v8, v0 */
		 /* add-int/lit8 v0, v1, 0x1 */
		 /* aput v5, v8, v1 */
		 /* add-int/lit8 v1, v0, 0x1 */
		 /* aput v4, v8, v0 */
		 /* add-int/lit8 v0, v1, 0x1 */
		 /* aput v5, v8, v1 */
		 /* add-int/lit8 v1, v0, 0x1 */
		 /* aput v2, v8, v0 */
		 /* add-int/lit8 v0, v1, 0x1 */
		 /* aput v3, v8, v1 */
		 /* add-int/lit8 v1, v0, 0x1 */
		 /* aput v6, v8, v0 */
		 /* add-int/lit8 v0, v1, 0x1 */
		 /* aput v7, v8, v1 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->mIndex:I */
		 return;
	 } // .end method
	 public Integer getIndex ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->mIndex:I */
	 } // .end method
	 public void setIndex ( Integer p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->mIndex:I */
		 return;
	 } // .end method
	 public void submit ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = this.mFloatBuffer;
		 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v2 ); // invoke-virtual {v0, v2}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
		 v1 = this.mBufferData;
		 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put([I)V
		 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v2 ); // invoke-virtual {v0, v2}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
		 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->setHardwareBufferNeedsUpdate()V */
		 return;
	 } // .end method
