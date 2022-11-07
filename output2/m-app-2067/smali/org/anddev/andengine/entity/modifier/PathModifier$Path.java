public class org.anddev.andengine.entity.modifier.PathModifier$Path {
	 /* # instance fields */
	 private final mCoordinatesX;
	 private final mCoordinatesY;
	 private Integer mIndex;
	 private Float mLength;
	 private Boolean mLengthChanged;
	 /* # direct methods */
	 public org.anddev.andengine.entity.modifier.PathModifier$Path ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
		 /* new-array v0, p1, [F */
		 this.mCoordinatesX = v0;
		 /* new-array v0, p1, [F */
		 this.mCoordinatesY = v0;
		 /* iput v1, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
		 /* iput-boolean v1, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.modifier.PathModifier$Path ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v3, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
		 v0 = 		 (( org.anddev.andengine.entity.modifier.PathModifier$Path ) p1 ).getSize ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->getSize()I
		 /* new-array v1, v0, [F */
		 this.mCoordinatesX = v1;
		 /* new-array v1, v0, [F */
		 this.mCoordinatesY = v1;
		 v1 = this.mCoordinatesX;
		 v2 = this.mCoordinatesX;
		 java.lang.System .arraycopy ( v1,v3,v2,v3,v0 );
		 v1 = this.mCoordinatesY;
		 v2 = this.mCoordinatesY;
		 java.lang.System .arraycopy ( v1,v3,v2,v3,v0 );
		 /* iget v0, p1, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
		 /* iget-boolean v0, p1, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
		 /* iget v0, p1, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLength:F */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLength:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.modifier.PathModifier$Path ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
		 /* array-length v0, p1 */
		 /* array-length v1, p2 */
		 /* if-eq v0, v1, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 final String v1 = "Coordinate-Arrays must have the same length."; // const-string v1, "Coordinate-Arrays must have the same length."
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 this.mCoordinatesX = p1;
	 this.mCoordinatesY = p2;
	 /* array-length v0, p1 */
	 /* iput v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
	 return;
} // .end method
private void updateLength ( ) {
	 /* .locals 4 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iget v1, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
	 int v2 = 2; // const/4 v2, 0x2
	 /* sub-int/2addr v1, v2 */
	 /* move v3, v1 */
	 /* move v1, v0 */
	 /* move v0, v3 */
} // :goto_0
/* if-gez v0, :cond_0 */
/* iput v1, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLength:F */
return;
} // :cond_0
v2 = (( org.anddev.andengine.entity.modifier.PathModifier$Path ) p0 ).getSegmentLength ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->getSegmentLength(I)F
/* add-float/2addr v1, v2 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
/* # virtual methods */
public java.lang.Object clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.entity.modifier.PathModifier$Path ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->clone()Lorg/anddev/andengine/entity/modifier/PathModifier$Path;
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier$Path clone ( ) {
/* .locals 1 */
/* new-instance v0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path; */
/* invoke-direct {v0, p0}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;-><init>(Lorg/anddev/andengine/entity/modifier/PathModifier$Path;)V */
} // .end method
public getCoordinatesX ( ) {
/* .locals 1 */
v0 = this.mCoordinatesX;
} // .end method
public getCoordinatesY ( ) {
/* .locals 1 */
v0 = this.mCoordinatesY;
} // .end method
public Float getLength ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->updateLength()V */
} // :cond_0
/* iget v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLength:F */
} // .end method
public Float getSegmentLength ( Integer p0 ) {
/* .locals 4 */
v0 = this.mCoordinatesX;
v1 = this.mCoordinatesY;
/* add-int/lit8 v2, p1, 0x1 */
/* aget v3, v0, p1 */
/* aget v0, v0, v2 */
/* sub-float v0, v3, v0 */
/* aget v3, v1, p1 */
/* aget v1, v1, v2 */
/* sub-float v1, v3, v1 */
/* mul-float/2addr v0, v0 */
/* mul-float/2addr v1, v1 */
/* add-float/2addr v0, v1 */
v0 = android.util.FloatMath .sqrt ( v0 );
} // .end method
public Integer getSize ( ) {
/* .locals 1 */
v0 = this.mCoordinatesX;
/* array-length v0, v0 */
} // .end method
public org.anddev.andengine.entity.modifier.PathModifier$Path to ( Float p0, Float p1 ) {
/* .locals 2 */
v0 = this.mCoordinatesX;
/* iget v1, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
/* aput p1, v0, v1 */
v0 = this.mCoordinatesY;
/* iget v1, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
/* aput p2, v0, v1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/modifier/PathModifier$Path;->mLengthChanged:Z */
} // .end method
