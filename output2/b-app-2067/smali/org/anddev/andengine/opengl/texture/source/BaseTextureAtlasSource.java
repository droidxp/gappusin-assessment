public abstract class org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource implements org.anddev.andengine.opengl.texture.source.ITextureAtlasSource {
	 /* # interfaces */
	 /* # instance fields */
	 protected Integer mTexturePositionX;
	 protected Integer mTexturePositionY;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->mTexturePositionX:I */
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->mTexturePositionY:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.Object clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;
	 } // .end method
	 public abstract org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource clone ( ) {
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;
	 } // .end method
	 public Integer getTexturePositionX ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->mTexturePositionX:I */
	 } // .end method
	 public Integer getTexturePositionY ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->mTexturePositionY:I */
	 } // .end method
	 public void setTexturePositionX ( Integer p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->mTexturePositionX:I */
		 return;
	 } // .end method
	 public void setTexturePositionY ( Integer p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->mTexturePositionY:I */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 java.lang.String .valueOf ( v1 );
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v1 = "( "; // const-string v1, "( "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->getWidth()I
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = "x"; // const-string v1, "x"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->getHeight()I
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = " @ "; // const-string v1, " @ "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->mTexturePositionX:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = "/"; // const-string v1, "/"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;->mTexturePositionY:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = " )"; // const-string v1, " )"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
