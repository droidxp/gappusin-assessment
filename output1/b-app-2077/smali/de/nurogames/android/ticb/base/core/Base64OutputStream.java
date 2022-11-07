class de.nurogames.android.ticb.base.core.Base64OutputStream extends java.io.FilterOutputStream {
	 /* .source "Base64OutputStream.java" */
	 /* # static fields */
	 private static toBase64;
	 /* # instance fields */
	 private Integer col;
	 private Integer i;
	 private inbuf;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.core.Base64OutputStream ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 55 */
		 /* const/16 v0, 0x40 */
		 /* new-array v0, v0, [C */
		 /* fill-array-data v0, :array_0 */
		 /* .line 60 */
		 return;
		 /* .line 55 */
		 /* :array_0 */
		 /* .array-data 2 */
		 /* 0x41s */
		 /* 0x42s */
		 /* 0x43s */
		 /* 0x44s */
		 /* 0x45s */
		 /* 0x46s */
		 /* 0x47s */
		 /* 0x48s */
		 /* 0x49s */
		 /* 0x4as */
		 /* 0x4bs */
		 /* 0x4cs */
		 /* 0x4ds */
		 /* 0x4es */
		 /* 0x4fs */
		 /* 0x50s */
		 /* 0x51s */
		 /* 0x52s */
		 /* 0x53s */
		 /* 0x54s */
		 /* 0x55s */
		 /* 0x56s */
		 /* 0x57s */
		 /* 0x58s */
		 /* 0x59s */
		 /* 0x5as */
		 /* 0x61s */
		 /* 0x62s */
		 /* 0x63s */
		 /* 0x64s */
		 /* 0x65s */
		 /* 0x66s */
		 /* 0x67s */
		 /* 0x68s */
		 /* 0x69s */
		 /* 0x6as */
		 /* 0x6bs */
		 /* 0x6cs */
		 /* 0x6ds */
		 /* 0x6es */
		 /* 0x6fs */
		 /* 0x70s */
		 /* 0x71s */
		 /* 0x72s */
		 /* 0x73s */
		 /* 0x74s */
		 /* 0x75s */
		 /* 0x76s */
		 /* 0x77s */
		 /* 0x78s */
		 /* 0x79s */
		 /* 0x7as */
		 /* 0x30s */
		 /* 0x31s */
		 /* 0x32s */
		 /* 0x33s */
		 /* 0x34s */
		 /* 0x35s */
		 /* 0x36s */
		 /* 0x37s */
		 /* 0x38s */
		 /* 0x39s */
		 /* 0x2bs */
		 /* 0x2fs */
	 } // .end array-data
} // .end method
public de.nurogames.android.ticb.base.core.Base64OutputStream ( ) {
	 /* .locals 1 */
	 /* .param p1, "out" # Ljava/io/OutputStream; */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 18 */
	 /* invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V */
	 /* .line 62 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->col:I */
	 /* .line 64 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->i:I */
	 /* .line 66 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* new-array v0, v0, [I */
	 this.inbuf = v0;
	 /* .line 19 */
	 return;
} // .end method
/* # virtual methods */
public void flush ( ) {
	 /* .locals 5 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x3d */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 41 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->i:I */
/* if-ne v0, v3, :cond_1 */
/* .line 42 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v2 */
/* and-int/lit16 v1, v1, 0xfc */
/* shr-int/lit8 v1, v1, 0x2 */
/* aget-char v0, v0, v1 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 43 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v2 */
/* and-int/lit8 v1, v1, 0x3 */
/* shl-int/lit8 v1, v1, 0x4 */
/* aget-char v0, v0, v1 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 44 */
/* invoke-super {p0, v4}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 45 */
/* invoke-super {p0, v4}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 53 */
} // :cond_0
} // :goto_0
return;
/* .line 46 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->i:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
/* .line 47 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v2 */
/* and-int/lit16 v1, v1, 0xfc */
/* shr-int/lit8 v1, v1, 0x2 */
/* aget-char v0, v0, v1 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 48 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v2 */
/* and-int/lit8 v1, v1, 0x3 */
/* shl-int/lit8 v1, v1, 0x4 */
/* .line 49 */
v2 = this.inbuf;
/* aget v2, v2, v3 */
/* and-int/lit16 v2, v2, 0xf0 */
/* shr-int/lit8 v2, v2, 0x4 */
/* or-int/2addr v1, v2 */
/* aget-char v0, v0, v1 */
/* .line 48 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 50 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v3 */
/* and-int/lit8 v1, v1, 0xf */
/* shl-int/lit8 v1, v1, 0x2 */
/* aget-char v0, v0, v1 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 51 */
/* invoke-super {p0, v4}, Ljava/io/FilterOutputStream;->write(I)V */
} // .end method
public void write ( Integer p0 ) {
/* .locals 6 */
/* .param p1, "c" # I */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
int v5 = 2; // const/4 v5, 0x2
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 22 */
v0 = this.inbuf;
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->i:I */
/* aput p1, v0, v1 */
/* .line 23 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->i:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->i:I */
/* .line 24 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->i:I */
int v1 = 3; // const/4 v1, 0x3
/* if-ne v0, v1, :cond_0 */
/* .line 25 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v3 */
/* and-int/lit16 v1, v1, 0xfc */
/* shr-int/lit8 v1, v1, 0x2 */
/* aget-char v0, v0, v1 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 26 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v3 */
/* and-int/lit8 v1, v1, 0x3 */
/* shl-int/lit8 v1, v1, 0x4 */
/* .line 27 */
v2 = this.inbuf;
/* aget v2, v2, v4 */
/* and-int/lit16 v2, v2, 0xf0 */
/* shr-int/lit8 v2, v2, 0x4 */
/* or-int/2addr v1, v2 */
/* aget-char v0, v0, v1 */
/* .line 26 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 28 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v4 */
/* and-int/lit8 v1, v1, 0xf */
/* shl-int/lit8 v1, v1, 0x2 */
/* .line 29 */
v2 = this.inbuf;
/* aget v2, v2, v5 */
/* and-int/lit16 v2, v2, 0xc0 */
/* shr-int/lit8 v2, v2, 0x6 */
/* or-int/2addr v1, v2 */
/* aget-char v0, v0, v1 */
/* .line 28 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 30 */
v0 = de.nurogames.android.ticb.base.core.Base64OutputStream.toBase64;
v1 = this.inbuf;
/* aget v1, v1, v5 */
/* and-int/lit8 v1, v1, 0x3f */
/* aget-char v0, v0, v1 */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 31 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->col:I */
/* add-int/lit8 v0, v0, 0x4 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->col:I */
/* .line 32 */
/* iput v3, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->i:I */
/* .line 33 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->col:I */
/* const/16 v1, 0x4c */
/* if-lt v0, v1, :cond_0 */
/* .line 34 */
/* const/16 v0, 0xa */
/* invoke-super {p0, v0}, Ljava/io/FilterOutputStream;->write(I)V */
/* .line 35 */
/* iput v3, p0, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->col:I */
/* .line 38 */
} // :cond_0
return;
} // .end method
