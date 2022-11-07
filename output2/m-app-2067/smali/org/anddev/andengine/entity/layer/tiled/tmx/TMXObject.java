public class org.anddev.andengine.entity.layer.tiled.tmx.TMXObject implements org.anddev.andengine.entity.layer.tiled.tmx.util.constants.TMXConstants {
	 /* # interfaces */
	 /* # instance fields */
	 private final Integer mHeight;
	 private final java.lang.String mName;
	 private final org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties mTMXObjectProperties;
	 private final java.lang.String mType;
	 private final Integer mWidth;
	 private final Integer mX;
	 private final Integer mY;
	 /* # direct methods */
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXObject ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;-><init>()V */
		 this.mTMXObjectProperties = v0;
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "name"; // const-string v1, "name"
		 this.mName = v0;
		 final String v0 = ""; // const-string v0, ""
		 final String v1 = "type"; // const-string v1, "type"
		 this.mType = v0;
		 final String v0 = "x"; // const-string v0, "x"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->mX:I */
		 final String v0 = "y"; // const-string v0, "y"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttributeOrThrow ( p1,v0 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->mY:I */
		 final String v0 = "width"; // const-string v0, "width"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttribute ( p1,v0,v2 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->mWidth:I */
		 final String v0 = "height"; // const-string v0, "height"
		 v0 = 		 org.anddev.andengine.util.SAXUtils .getIntAttribute ( p1,v0,v2 );
		 /* iput v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->mHeight:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void addTMXObjectProperty ( org.anddev.andengine.entity.layer.tiled.tmx.TMXObjectProperty p0 ) {
		 /* .locals 1 */
		 v0 = this.mTMXObjectProperties;
		 (( org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXProperties;->add(Ljava/lang/Object;)Z
		 return;
	 } // .end method
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->mHeight:I */
	 } // .end method
	 public java.lang.String getName ( ) {
		 /* .locals 1 */
		 v0 = this.mName;
	 } // .end method
	 public org.anddev.andengine.entity.layer.tiled.tmx.TMXProperties getTMXObjectProperties ( ) {
		 /* .locals 1 */
		 v0 = this.mTMXObjectProperties;
	 } // .end method
	 public java.lang.String getType ( ) {
		 /* .locals 1 */
		 v0 = this.mType;
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->mWidth:I */
	 } // .end method
	 public Integer getX ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->mX:I */
	 } // .end method
	 public Integer getY ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/layer/tiled/tmx/TMXObject;->mY:I */
	 } // .end method
