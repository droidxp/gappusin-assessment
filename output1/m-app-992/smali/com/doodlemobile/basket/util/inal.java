public class inal {
	 /* # static fields */
	 public static Float a;
	 public static Float b;
	 public static Float c;
	 public static Float d;
	 private static Integer j;
	 private static final com.doodlemobile.basket.util.c k;
	 /* # instance fields */
	 private Integer e;
	 private f;
	 private g;
	 private Long h;
	 private Integer i;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 6 */
		 int v5 = 5; // const/4 v5, 0x5
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 /* const-class v0, Landroid/view/MotionEvent; */
			 final String v1 = "getPointerCount"; // const-string v1, "getPointerCount"
			 int v2 = 0; // const/4 v2, 0x0
			 /* new-array v2, v2, [Ljava/lang/Class; */
			 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 if ( v1 != null) { // if-eqz v1, :cond_0
				 final String v1 = "getPointerId"; // const-string v1, "getPointerId"
				 int v2 = 1; // const/4 v2, 0x1
				 /* new-array v2, v2, [Ljava/lang/Class; */
				 int v3 = 0; // const/4 v3, 0x0
				 v4 = java.lang.Integer.TYPE;
				 /* aput-object v4, v2, v3 */
				 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
				 if ( v1 != null) { // if-eqz v1, :cond_0
					 final String v1 = "getX"; // const-string v1, "getX"
					 int v2 = 1; // const/4 v2, 0x1
					 /* new-array v2, v2, [Ljava/lang/Class; */
					 int v3 = 0; // const/4 v3, 0x0
					 v4 = java.lang.Integer.TYPE;
					 /* aput-object v4, v2, v3 */
					 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
					 if ( v1 != null) { // if-eqz v1, :cond_0
						 final String v1 = "getY"; // const-string v1, "getY"
						 int v2 = 1; // const/4 v2, 0x1
						 /* new-array v2, v2, [Ljava/lang/Class; */
						 int v3 = 0; // const/4 v3, 0x0
						 v4 = java.lang.Integer.TYPE;
						 /* aput-object v4, v2, v3 */
						 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
						 if ( v0 != null) { // if-eqz v0, :cond_0
							 int v0 = 5; // const/4 v0, 0x5
							 /* :try_end_0 */
							 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
						 } // :cond_0
					 } // :goto_0
					 /* if-lt v0, v5, :cond_1 */
					 /* new-instance v0, Lcom/doodlemobile/basket/util/g; */
					 /* invoke-direct {v0}, Lcom/doodlemobile/basket/util/g;-><init>()V */
				 } // :goto_1
				 return;
			 } // :cond_1
			 /* new-instance v0, Lcom/doodlemobile/basket/util/f; */
			 /* invoke-direct {v0}, Lcom/doodlemobile/basket/util/f;-><init>()V */
			 /* :catch_0 */
			 /* move-exception v0 */
		 } // .end method
		 public inal ( ) {
			 /* .locals 1 */
			 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
			 /* const/16 v0, 0x14 */
			 /* new-array v0, v0, [I */
			 this.f = v0;
			 /* const/16 v0, 0x64 */
			 /* new-array v0, v0, [F */
			 this.g = v0;
			 return;
		 } // .end method
		 static Integer a ( Object p0, Integer p1 ) { //synthethic
			 /* .locals 0 */
			 /* iput p1, p0, Lcom/doodlemobile/basket/util/e;->e:I */
		 } // .end method
		 static Long a ( Object p0, Long p1 ) { //synthethic
			 /* .locals 0 */
			 /* iput-wide p1, p0, Lcom/doodlemobile/basket/util/e;->h:J */
			 /* return-wide p1 */
		 } // .end method
		 static a ( Object p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.f;
		 } // .end method
		 static Integer b ( Object p0, Integer p1 ) { //synthethic
			 /* .locals 0 */
			 /* iput p1, p0, Lcom/doodlemobile/basket/util/e;->i:I */
		 } // .end method
		 static b ( Object p0 ) { //synthethic
			 /* .locals 1 */
			 v0 = this.g;
		 } // .end method
		 /* # virtual methods */
		 public final Float a ( ) {
			 /* .locals 2 */
			 v0 = this.g;
			 int v1 = 0; // const/4 v1, 0x0
			 /* aget v0, v0, v1 */
		 } // .end method
		 public final void a ( Float p0, Float p1 ) {
			 /* .locals 2 */
			 v0 = this.g;
			 int v1 = 0; // const/4 v1, 0x0
			 /* aput p1, v0, v1 */
			 v0 = this.g;
			 int v1 = 1; // const/4 v1, 0x1
			 /* aput p2, v0, v1 */
			 return;
		 } // .end method
		 public final void a ( Integer p0 ) {
			 /* .locals 1 */
			 /* iget v0, p0, Lcom/doodlemobile/basket/util/e;->e:I */
			 /* and-int/lit16 v0, v0, -0x100 */
			 /* or-int/2addr v0, p1 */
			 /* iput v0, p0, Lcom/doodlemobile/basket/util/e;->e:I */
			 return;
		 } // .end method
		 public final void a ( android.view.MotionEvent p0 ) {
			 /* .locals 1 */
			 v0 = com.doodlemobile.basket.util.e.k;
			 return;
		 } // .end method
		 public final Float b ( ) {
			 /* .locals 2 */
			 v0 = this.g;
			 int v1 = 1; // const/4 v1, 0x1
			 /* aget v0, v0, v1 */
		 } // .end method
		 public final void b ( Float p0, Float p1 ) {
			 /* .locals 5 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
		 /* iget v1, p0, Lcom/doodlemobile/basket/util/e;->i:I */
		 /* if-ge v0, v1, :cond_0 */
		 /* mul-int/lit8 v1, v0, 0x5 */
		 v2 = this.g;
		 /* add-int/lit8 v3, v1, 0x1 */
		 /* aget v4, v2, v1 */
		 /* add-float/2addr v4, p1 */
		 /* aput v4, v2, v1 */
		 v1 = this.g;
		 /* aget v2, v1, v3 */
		 /* add-float/2addr v2, p2 */
		 /* aput v2, v1, v3 */
		 /* add-int/lit8 v0, v0, 0x1 */
	 } // :cond_0
	 return;
} // .end method
public final Long c ( ) {
	 /* .locals 2 */
	 /* iget-wide v0, p0, Lcom/doodlemobile/basket/util/e;->h:J */
	 /* return-wide v0 */
} // .end method
public final void c ( Float p0, Float p1 ) {
	 /* .locals 5 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iget v1, p0, Lcom/doodlemobile/basket/util/e;->i:I */
/* if-ge v0, v1, :cond_0 */
/* mul-int/lit8 v1, v0, 0x5 */
v2 = this.g;
/* add-int/lit8 v3, v1, 0x1 */
/* aget v4, v2, v1 */
/* mul-float/2addr v4, p1 */
/* aput v4, v2, v1 */
v1 = this.g;
/* aget v2, v1, v3 */
/* mul-float/2addr v2, p2 */
/* aput v2, v1, v3 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public final Integer d ( ) {
/* .locals 1 */
/* iget v0, p0, Lcom/doodlemobile/basket/util/e;->e:I */
/* and-int/lit16 v0, v0, 0xff */
} // .end method
public final void e ( ) {
/* .locals 5 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* iget v1, p0, Lcom/doodlemobile/basket/util/e;->i:I */
/* if-ge v0, v1, :cond_0 */
/* mul-int/lit8 v1, v0, 0x5 */
v2 = this.g;
v3 = this.g;
/* add-int/lit8 v4, v1, 0x2 */
/* aget v3, v3, v4 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v3, v4 */
/* aput v3, v2, v1 */
v2 = this.g;
/* add-int/lit8 v3, v1, 0x1 */
v4 = this.g;
/* add-int/lit8 v1, v1, 0x3 */
/* aget v1, v4, v1 */
/* mul-float/2addr v1, v4 */
/* add-float/2addr v1, v4 */
/* aput v1, v2, v3 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
