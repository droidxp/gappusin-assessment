public class com.tgb.bg.jevcyxq.refurbished.k extends org.anddev.andengine.entity.sprite.Sprite {
	 /* # direct methods */
	 public com.tgb.bg.jevcyxq.refurbished.k ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/entity/sprite/Sprite;-><init>(FFFFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 return;
	 } // .end method
	 public com.tgb.bg.jevcyxq.refurbished.k ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3}, Lorg/anddev/andengine/entity/sprite/Sprite;-><init>(FFLorg/anddev/andengine/opengl/texture/region/TextureRegion;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean detachChild ( org.anddev.andengine.entity.IEntity p0 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 org.anddev.andengine.opengl.buffer.BufferObjectManager .getActiveInstance ( );
			 /* move-object v0, p1 */
			 /* check-cast v0, Lcom/tgb/bg/jevcyxq/refurbished/k; */
			 /* move-object v1, v0 */
			 (( com.tgb.bg.jevcyxq.refurbished.k ) v1 ).getVertexBuffer ( ); // invoke-virtual {v1}, Lcom/tgb/bg/jevcyxq/refurbished/k;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;
			 (( org.anddev.andengine.opengl.buffer.BufferObjectManager ) v2 ).unloadBufferObject ( v1 ); // invoke-virtual {v2, v1}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->unloadBufferObject(Lorg/anddev/andengine/opengl/buffer/BufferObject;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 v1 = 		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/sprite/Sprite;->detachChild(Lorg/anddev/andengine/entity/IEntity;)Z */
		 /* :catch_0 */
		 /* move-exception v1 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "Eception occured in detachChild(IEntity pEntity) -> "; // const-string v2, "Eception occured in detachChild(IEntity pEntity) -> "
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
	 public Boolean detachSelf ( ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 org.anddev.andengine.opengl.buffer.BufferObjectManager .getActiveInstance ( );
			 (( com.tgb.bg.jevcyxq.refurbished.k ) p0 ).getTextureRegion ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/k;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/TextureRegion;
			 (( org.anddev.andengine.opengl.texture.region.TextureRegion ) v1 ).getTextureBuffer ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/region/TextureRegion;->getTextureBuffer()Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;
			 (( org.anddev.andengine.opengl.buffer.BufferObjectManager ) v0 ).unloadBufferObject ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->unloadBufferObject(Lorg/anddev/andengine/opengl/buffer/BufferObject;)V
			 org.anddev.andengine.opengl.buffer.BufferObjectManager .getActiveInstance ( );
			 (( com.tgb.bg.jevcyxq.refurbished.k ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/k;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;
			 (( org.anddev.andengine.opengl.buffer.BufferObjectManager ) v0 ).unloadBufferObject ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->unloadBufferObject(Lorg/anddev/andengine/opengl/buffer/BufferObject;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 v0 = 		 /* invoke-super {p0}, Lorg/anddev/andengine/entity/sprite/Sprite;->detachSelf()Z */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "Eception occured in detachSelf() -> "; // const-string v1, "Eception occured in detachSelf() -> "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
