public class org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect {
	 /* # instance fields */
	 private final Integer mHeight;
	 private final Integer mLeft;
	 private final Integer mTop;
	 private final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mLeft:I */
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mTop:I */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mWidth:I */
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mHeight:I */
		 return;
	 } // .end method
	 static Integer access$0 ( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mLeft:I */
	 } // .end method
	 static Integer access$1 ( org.anddev.andengine.opengl.texture.buildable.builder.BlackPawnTextureBuilder$Rect p0 ) { //synthethic
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mTop:I */
	 } // .end method
	 /* # virtual methods */
	 public Integer getBottom ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mTop:I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mHeight:I */
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mHeight:I */
	 } // .end method
	 public Integer getLeft ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mLeft:I */
	 } // .end method
	 public Integer getRight ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mLeft:I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mWidth:I */
		 /* add-int/2addr v0, v1 */
	 } // .end method
	 public Integer getTop ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mTop:I */
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mWidth:I */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "@: "; // const-string v1, "@: "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mLeft:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = "/"; // const-string v1, "/"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mTop:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = " * "; // const-string v1, " * "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mWidth:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = "x"; // const-string v1, "x"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/buildable/builder/BlackPawnTextureBuilder$Rect;->mHeight:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
