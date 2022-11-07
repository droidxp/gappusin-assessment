public class org.haxe.nme.Value {
	 /* .source "Value.java" */
	 /* # instance fields */
	 Double mValue;
	 /* # direct methods */
	 public org.haxe.nme.Value ( ) {
		 /* .locals 2 */
		 /* .param p1, "inValue" # C */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* int-to-double v0, p1 */
		 /* iput-wide v0, p0, Lorg/haxe/nme/Value;->mValue:D */
		 return;
	 } // .end method
	 public org.haxe.nme.Value ( ) {
		 /* .locals 0 */
		 /* .param p1, "inValue" # D */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-wide p1, p0, Lorg/haxe/nme/Value;->mValue:D */
		 return;
	 } // .end method
	 public org.haxe.nme.Value ( ) {
		 /* .locals 2 */
		 /* .param p1, "inValue" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* int-to-double v0, p1 */
		 /* iput-wide v0, p0, Lorg/haxe/nme/Value;->mValue:D */
		 return;
	 } // .end method
	 public org.haxe.nme.Value ( ) {
		 /* .locals 2 */
		 /* .param p1, "inValue" # S */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* int-to-double v0, p1 */
		 /* iput-wide v0, p0, Lorg/haxe/nme/Value;->mValue:D */
		 return;
	 } // .end method
	 public org.haxe.nme.Value ( ) {
		 /* .locals 2 */
		 /* .param p1, "inValue" # Z */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 /* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
		 } // :goto_0
		 /* iput-wide v0, p0, Lorg/haxe/nme/Value;->mValue:D */
		 return;
	 } // :cond_0
	 /* const-wide/16 v0, 0x0 */
} // .end method
/* # virtual methods */
public Double getDouble ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 13 */
	 /* iget-wide v0, p0, Lorg/haxe/nme/Value;->mValue:D */
	 /* return-wide v0 */
} // .end method
