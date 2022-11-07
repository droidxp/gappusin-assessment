public class com.wiyun.engine.types.WYRect implements com.wiyun.engine.types.ICopyable {
	 /* .source "WYRect.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/types/WYRect$Edge; */
	 /* } */
} // .end annotation
/* # static fields */
private static $SWITCH_TABLE$com$wiyun$engine$types$WYRect$Edge; //synthetic
private static com.wiyun.engine.types.WYRect rRect;
private static com.wiyun.engine.types.WYRect sRect;
/* # instance fields */
public com.wiyun.engine.types.WYPoint origin;
public com.wiyun.engine.types.WYSize size;
/* # direct methods */
static $SWITCH_TABLE$com$wiyun$engine$types$WYRect$Edge ( ) { //synthethic
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 4 */
	 v0 = com.wiyun.engine.types.WYRect.$SWITCH_TABLE$com$wiyun$engine$types$WYRect$Edge;
	 if ( v0 != null) { // if-eqz v0, :cond_0
	 } // :goto_0
} // :cond_0
com.wiyun.engine.types.WYRect$Edge .values ( );
/* array-length v0, v0 */
/* new-array v0, v0, [I */
try { // :try_start_0
	 v1 = com.wiyun.engine.types.WYRect$Edge.MaxXEdge;
	 v1 = 	 (( com.wiyun.engine.types.WYRect$Edge ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect$Edge;->ordinal()I
	 int v2 = 3; // const/4 v2, 0x3
	 /* aput v2, v0, v1 */
	 /* :try_end_0 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_3 */
} // :goto_1
try { // :try_start_1
	 v1 = com.wiyun.engine.types.WYRect$Edge.MaxYEdge;
	 v1 = 	 (( com.wiyun.engine.types.WYRect$Edge ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect$Edge;->ordinal()I
	 int v2 = 4; // const/4 v2, 0x4
	 /* aput v2, v0, v1 */
	 /* :try_end_1 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_2 */
} // :goto_2
try { // :try_start_2
	 v1 = com.wiyun.engine.types.WYRect$Edge.MinXEdge;
	 v1 = 	 (( com.wiyun.engine.types.WYRect$Edge ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect$Edge;->ordinal()I
	 int v2 = 1; // const/4 v2, 0x1
	 /* aput v2, v0, v1 */
	 /* :try_end_2 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_1 */
} // :goto_3
try { // :try_start_3
	 v1 = com.wiyun.engine.types.WYRect$Edge.MinYEdge;
	 v1 = 	 (( com.wiyun.engine.types.WYRect$Edge ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect$Edge;->ordinal()I
	 int v2 = 2; // const/4 v2, 0x2
	 /* aput v2, v0, v1 */
	 /* :try_end_3 */
	 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_0 */
} // :goto_4
/* :catch_0 */
/* move-exception v1 */
/* :catch_1 */
/* move-exception v1 */
/* :catch_2 */
/* move-exception v1 */
/* :catch_3 */
/* move-exception v1 */
} // .end method
static com.wiyun.engine.types.WYRect ( ) {
/* .locals 1 */
/* .prologue */
/* .line 180 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYRect;-><init>()V */
/* .line 181 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYRect;-><init>()V */
/* .line 4 */
return;
} // .end method
private com.wiyun.engine.types.WYRect ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 9 */
/* invoke-direct {p0, v0, v0, v0, v0}, Lcom/wiyun/engine/types/WYRect;-><init>(FFFF)V */
/* .line 10 */
return;
} // .end method
private com.wiyun.engine.types.WYRect ( ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .param p3, "w" # F */
/* .param p4, "h" # F */
/* .prologue */
/* .line 33 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 34 */
com.wiyun.engine.types.WYPoint .make ( p1,p2 );
this.origin = v0;
/* .line 35 */
com.wiyun.engine.types.WYSize .make ( p3,p4 );
this.size = v0;
/* .line 36 */
return;
} // .end method
private com.wiyun.engine.types.WYRect ( ) {
/* .locals 4 */
/* .param p1, "origin" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p2, "size" # Lcom/wiyun/engine/types/WYSize; */
/* .prologue */
/* .line 13 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v2, p2, Lcom/wiyun/engine/types/WYSize;->width:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYSize;->height:F */
/* invoke-direct {p0, v0, v1, v2, v3}, Lcom/wiyun/engine/types/WYRect;-><init>(FFFF)V */
/* .line 14 */
return;
} // .end method
public static com.wiyun.engine.types.WYRect make ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 1 */
/* .param p0, "x" # F */
/* .param p1, "y" # F */
/* .param p2, "w" # F */
/* .param p3, "h" # F */
/* .prologue */
/* .line 30 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/types/WYRect;-><init>(FFFF)V */
} // .end method
public static com.wiyun.engine.types.WYRect make ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYSize p1 ) {
/* .locals 5 */
/* .param p0, "origin" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p1, "size" # Lcom/wiyun/engine/types/WYSize; */
/* .prologue */
/* .line 26 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect; */
/* iget v1, p0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v2, p0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* iget v3, p1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* iget v4, p1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* invoke-direct {v0, v1, v2, v3, v4}, Lcom/wiyun/engine/types/WYRect;-><init>(FFFF)V */
} // .end method
public static com.wiyun.engine.types.WYRect makeZero ( ) {
/* .locals 1 */
/* .prologue */
/* .line 22 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYRect;-><init>()V */
} // .end method
/* # virtual methods */
public void applyTransform ( com.wiyun.engine.types.WYAffineTransform p0 ) {
/* .locals 4 */
/* .param p1, "transform" # Lcom/wiyun/engine/types/WYAffineTransform; */
/* .prologue */
/* .line 120 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
/* add-float/2addr v1, v2 */
v2 = this.origin;
/* iget v2, v2, Lcom/wiyun/engine/types/WYPoint;->y:F */
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->height:F */
/* add-float/2addr v2, v3 */
com.wiyun.engine.types.WYPoint .make ( v1,v2 );
/* .line 121 */
/* .local v0, "other":Lcom/wiyun/engine/types/WYPoint; */
v1 = this.origin;
(( com.wiyun.engine.types.WYAffineTransform ) p1 ).transform ( v1 ); // invoke-virtual {p1, v1}, Lcom/wiyun/engine/types/WYAffineTransform;->transform(Lcom/wiyun/engine/types/WYPoint;)Lcom/wiyun/engine/types/WYPoint;
/* .line 122 */
(( com.wiyun.engine.types.WYAffineTransform ) p1 ).transform ( v0 ); // invoke-virtual {p1, v0}, Lcom/wiyun/engine/types/WYAffineTransform;->transform(Lcom/wiyun/engine/types/WYPoint;)Lcom/wiyun/engine/types/WYPoint;
/* .line 123 */
v1 = this.size;
/* iget v2, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
v3 = this.origin;
/* iget v3, v3, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* sub-float/2addr v2, v3 */
/* iput v2, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* .line 124 */
v1 = this.size;
/* iget v2, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
v3 = this.origin;
/* iget v3, v3, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* sub-float/2addr v2, v3 */
/* iput v2, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* .line 125 */
return;
} // .end method
public Boolean containsPoint ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 98 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).minX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->minX()F
/* cmpl-float v0, p1, v0 */
/* if-ltz v0, :cond_0 */
/* .line 99 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).minY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->minY()F
/* cmpl-float v0, p2, v0 */
/* if-ltz v0, :cond_0 */
/* .line 100 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).maxX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxX()F
/* cmpg-float v0, p1, v0 */
/* if-gez v0, :cond_0 */
/* .line 101 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).maxY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* cmpg-float v0, p2, v0 */
/* if-gez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 98 */
} // .end method
public Boolean containsPoint ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 2 */
/* .param p1, "aPoint" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 86 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p1, Lcom/wiyun/engine/types/WYPoint;->y:F */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).containsPoint ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/wiyun/engine/types/WYRect;->containsPoint(FF)Z
} // .end method
public Boolean containsRect ( com.wiyun.engine.types.WYRect p0 ) {
/* .locals 2 */
/* .param p1, "bRect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 112 */
v0 = (( com.wiyun.engine.types.WYRect ) p1 ).isEmpty ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYRect;->isEmpty()Z
/* if-nez v0, :cond_0 */
/* .line 113 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).minX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->minX()F
v1 = (( com.wiyun.engine.types.WYRect ) p1 ).minX ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYRect;->minX()F
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
/* .line 114 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).minY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->minY()F
v1 = (( com.wiyun.engine.types.WYRect ) p1 ).minY ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYRect;->minY()F
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
/* .line 115 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).maxX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxX()F
v1 = (( com.wiyun.engine.types.WYRect ) p1 ).maxX ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYRect;->maxX()F
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_0 */
/* .line 116 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).maxY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxY()F
v1 = (( com.wiyun.engine.types.WYRect ) p1 ).maxY ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 112 */
} // .end method
public java.lang.Object copy ( ) {
/* .locals 5 */
/* .prologue */
/* .line 39 */
/* new-instance v0, Lcom/wiyun/engine/types/WYRect; */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
v2 = this.origin;
/* iget v2, v2, Lcom/wiyun/engine/types/WYPoint;->y:F */
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->width:F */
v4 = this.size;
/* iget v4, v4, Lcom/wiyun/engine/types/WYSize;->height:F */
/* invoke-direct {v0, v1, v2, v3, v4}, Lcom/wiyun/engine/types/WYRect;-><init>(FFFF)V */
} // .end method
public void divideRect ( com.wiyun.engine.types.WYRect[] p0, com.wiyun.engine.types.WYRect[] p1, Float p2, com.wiyun.engine.types.WYRect$Edge p3 ) {
/* .locals 6 */
/* .param p1, "slice" # [Lcom/wiyun/engine/types/WYRect; */
/* .param p2, "remainder" # [Lcom/wiyun/engine/types/WYRect; */
/* .param p3, "amount" # F */
/* .param p4, "edge" # Lcom/wiyun/engine/types/WYRect$Edge; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
int v3 = 0; // const/4 v3, 0x0
int v5 = 0; // const/4 v5, 0x0
/* .line 184 */
/* if-nez p1, :cond_0 */
/* .line 185 */
/* new-array p1, v1, [Lcom/wiyun/engine/types/WYRect; */
} // .end local p1 # "slice":[Lcom/wiyun/engine/types/WYRect;
v0 = com.wiyun.engine.types.WYRect.sRect;
/* aput-object v0, p1, v5 */
/* .line 187 */
/* .restart local p1 # "slice":[Lcom/wiyun/engine/types/WYRect; */
} // :cond_0
/* if-nez p2, :cond_1 */
/* .line 188 */
/* new-array p2, v1, [Lcom/wiyun/engine/types/WYRect; */
} // .end local p2 # "remainder":[Lcom/wiyun/engine/types/WYRect;
v0 = com.wiyun.engine.types.WYRect.rRect;
/* aput-object v0, p2, v5 */
/* .line 190 */
/* .restart local p2 # "remainder":[Lcom/wiyun/engine/types/WYRect; */
} // :cond_1
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).isEmpty ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->isEmpty()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 191 */
com.wiyun.engine.types.WYRect .make ( v3,v3,v3,v3 );
/* aput-object v0, p1, v5 */
/* .line 192 */
com.wiyun.engine.types.WYRect .make ( v3,v3,v3,v3 );
/* aput-object v0, p2, v5 */
/* .line 271 */
} // :goto_0
return;
/* .line 196 */
} // :cond_2
com.wiyun.engine.types.WYRect .$SWITCH_TABLE$com$wiyun$engine$types$WYRect$Edge ( );
v1 = (( com.wiyun.engine.types.WYRect$Edge ) p4 ).ordinal ( ); // invoke-virtual {p4}, Lcom/wiyun/engine/types/WYRect$Edge;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
/* .line 198 */
/* :pswitch_0 */
v0 = this.size;
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
/* cmpl-float v0, p3, v0 */
/* if-lez v0, :cond_3 */
/* .line 199 */
/* aput-object p0, p1, v5 */
/* .line 200 */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).maxX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxX()F
/* .line 201 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 203 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->height:F */
/* .line 200 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v3,v2 );
/* aput-object v0, p2, v5 */
/* .line 205 */
} // :cond_3
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 206 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 208 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->height:F */
/* .line 205 */
com.wiyun.engine.types.WYRect .make ( v0,v1,p3,v2 );
/* aput-object v0, p1, v5 */
/* .line 209 */
/* aget-object v0, p1, v5 */
v0 = (( com.wiyun.engine.types.WYRect ) v0 ).maxX ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/types/WYRect;->maxX()F
/* .line 210 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 211 */
v2 = (( com.wiyun.engine.types.WYRect ) p0 ).maxX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxX()F
/* aget-object v3, p1, v5 */
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).maxX ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->maxX()F
/* sub-float/2addr v2, v3 */
/* .line 212 */
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->height:F */
/* .line 209 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v2,v3 );
/* aput-object v0, p2, v5 */
/* .line 216 */
/* :pswitch_1 */
v0 = this.size;
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
/* cmpl-float v0, p3, v0 */
/* if-lez v0, :cond_4 */
/* .line 217 */
/* aput-object p0, p1, v5 */
/* .line 218 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 219 */
v1 = (( com.wiyun.engine.types.WYRect ) p0 ).maxY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* .line 220 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
/* .line 218 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v2,v3 );
/* aput-object v0, p2, v5 */
/* .line 222 */
} // :cond_4
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 223 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 224 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
/* .line 222 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v2,p3 );
/* aput-object v0, p1, v5 */
/* .line 226 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 227 */
/* aget-object v1, p1, v5 */
v1 = (( com.wiyun.engine.types.WYRect ) v1 ).maxY ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* .line 228 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
/* .line 229 */
v3 = (( com.wiyun.engine.types.WYRect ) p0 ).maxY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* aget-object v4, p1, v5 */
v4 = (( com.wiyun.engine.types.WYRect ) v4 ).maxY ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* sub-float/2addr v3, v4 */
/* .line 226 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v2,v3 );
/* aput-object v0, p2, v5 */
/* goto/16 :goto_0 */
/* .line 233 */
/* :pswitch_2 */
v0 = this.size;
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
/* cmpl-float v0, p3, v0 */
/* if-lez v0, :cond_5 */
/* .line 234 */
/* aput-object p0, p1, v5 */
/* .line 235 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 236 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 238 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->height:F */
/* .line 235 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v3,v2 );
/* aput-object v0, p2, v5 */
/* goto/16 :goto_0 */
/* .line 240 */
} // :cond_5
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).maxX ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxX()F
/* sub-float/2addr v0, p3 */
/* .line 241 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 243 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->height:F */
/* .line 240 */
com.wiyun.engine.types.WYRect .make ( v0,v1,p3,v2 );
/* aput-object v0, p1, v5 */
/* .line 244 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 245 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 246 */
/* aget-object v2, p1, v5 */
v2 = (( com.wiyun.engine.types.WYRect ) v2 ).minX ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/types/WYRect;->minX()F
v3 = this.origin;
/* iget v3, v3, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* sub-float/2addr v2, v3 */
/* .line 247 */
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->height:F */
/* .line 244 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v2,v3 );
/* aput-object v0, p2, v5 */
/* goto/16 :goto_0 */
/* .line 251 */
/* :pswitch_3 */
v0 = this.size;
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
/* cmpl-float v0, p3, v0 */
/* if-lez v0, :cond_6 */
/* .line 252 */
/* aput-object p0, p1, v5 */
/* .line 253 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 254 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 255 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
/* .line 253 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v2,v3 );
/* aput-object v0, p2, v5 */
/* goto/16 :goto_0 */
/* .line 258 */
} // :cond_6
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 259 */
v1 = (( com.wiyun.engine.types.WYRect ) p0 ).maxY ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/types/WYRect;->maxY()F
/* sub-float/2addr v1, p3 */
/* .line 260 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
/* .line 258 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v2,p3 );
/* aput-object v0, p1, v5 */
/* .line 262 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* .line 263 */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* .line 264 */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->width:F */
/* .line 265 */
/* aget-object v3, p1, v5 */
v3 = (( com.wiyun.engine.types.WYRect ) v3 ).minY ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/types/WYRect;->minY()F
v4 = this.origin;
/* iget v4, v4, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* sub-float/2addr v3, v4 */
/* .line 262 */
com.wiyun.engine.types.WYRect .make ( v0,v1,v2,v3 );
/* aput-object v0, p2, v5 */
/* goto/16 :goto_0 */
/* .line 196 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
public Boolean isEmpty ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 170 */
v0 = this.size;
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->width:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
v0 = this.size;
/* iget v0, v0, Lcom/wiyun/engine/types/WYSize;->height:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean isEqualTo ( com.wiyun.engine.types.WYRect p0 ) {
/* .locals 2 */
/* .param p1, "r" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 75 */
v0 = this.origin;
v1 = this.origin;
v0 = com.wiyun.engine.types.WYPoint .isEqual ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.size;
v1 = this.size;
v0 = com.wiyun.engine.types.WYSize .isEqual ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isIntersect ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 2 */
/* .param p1, "l" # F */
/* .param p2, "t" # F */
/* .param p3, "r" # F */
/* .param p4, "b" # F */
/* .prologue */
/* .line 62 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* cmpg-float v0, v0, p3 */
/* if-gez v0, :cond_0 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* add-float/2addr v0, v1 */
/* cmpg-float v0, p1, v0 */
/* if-gez v0, :cond_0 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* cmpg-float v0, v0, p2 */
/* if-gez v0, :cond_0 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* add-float/2addr v0, v1 */
/* cmpg-float v0, p4, v0 */
/* if-gez v0, :cond_0 */
/* .line 63 */
int v0 = 1; // const/4 v0, 0x1
/* .line 66 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isIntersect ( com.wiyun.engine.types.WYRect p0 ) {
/* .locals 4 */
/* .param p1, "r" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 49 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
v2 = this.size;
/* iget v2, v2, Lcom/wiyun/engine/types/WYSize;->height:F */
/* add-float/2addr v1, v2 */
v2 = this.origin;
/* iget v2, v2, Lcom/wiyun/engine/types/WYPoint;->x:F */
v3 = this.size;
/* iget v3, v3, Lcom/wiyun/engine/types/WYSize;->width:F */
/* add-float/2addr v2, v3 */
v3 = this.origin;
/* iget v3, v3, Lcom/wiyun/engine/types/WYPoint;->y:F */
v0 = (( com.wiyun.engine.types.WYRect ) p0 ).isIntersect ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lcom/wiyun/engine/types/WYRect;->isIntersect(FFFF)Z
} // .end method
public Float maxX ( ) {
/* .locals 2 */
/* .prologue */
/* .line 131 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* add-float/2addr v0, v1 */
} // .end method
public Float maxY ( ) {
/* .locals 2 */
/* .prologue */
/* .line 138 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* add-float/2addr v0, v1 */
} // .end method
public Float midX ( ) {
/* .locals 5 */
/* .prologue */
/* .line 145 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
/* float-to-double v1, v1 */
/* const-wide/high16 v3, 0x4000000000000000L # 2.0 */
/* div-double/2addr v1, v3 */
/* double-to-float v1, v1 */
/* add-float/2addr v0, v1 */
} // .end method
public Float midY ( ) {
/* .locals 5 */
/* .prologue */
/* .line 152 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
/* float-to-double v1, v1 */
/* const-wide/high16 v3, 0x4000000000000000L # 2.0 */
/* div-double/2addr v1, v3 */
/* double-to-float v1, v1 */
/* add-float/2addr v0, v1 */
} // .end method
public Float minX ( ) {
/* .locals 1 */
/* .prologue */
/* .line 159 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->x:F */
} // .end method
public Float minY ( ) {
/* .locals 1 */
/* .prologue */
/* .line 166 */
v0 = this.origin;
/* iget v0, v0, Lcom/wiyun/engine/types/WYPoint;->y:F */
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 71 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "(("; // const-string v1, "(("
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->x:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ", "; // const-string v1, ", "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.origin;
/* iget v1, v1, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "),("; // const-string v1, "),("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->width:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ", "; // const-string v1, ", "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.size;
/* iget v1, v1, Lcom/wiyun/engine/types/WYSize;->height:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "))"; // const-string v1, "))"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
