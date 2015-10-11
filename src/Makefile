#
# Simple development makefile
#

#
# add more flags here,
# but don't remove the "+="
#
ARCH        = 
RELEASEDIR  = ../../../lib/linux/$(ARCH)

prefix      = /usr
exec_prefix = $(prefix)
libdir 	    = $(exec_prefix)/lib/jni

CFLAGS                   += -fPIC -DUSE_LEGACY_BEEPER


ifeq ($(CC),cc)
CFLAGS += -fPIC -I/usr/lib/jvm/java-6-openjdk-amd64/include
endif

ifdef KERNEL
CFLAGS   += -I$(KERNEL)/include
endif
CFLAGS   += -O2 -g -Wall 
CPPFLAGS +=
LDFLAGS  += -shared 

STRIP    ?= strip
INSTALL  ?= install


libTest.so: TestValgrind.c
	$(CC) $^ $(CFLAGS) $(LDFLAGS) -o $@ 


clean:
	-rm -f libTest.so

install:


.PHONY: all install clean

# end of development makefile
