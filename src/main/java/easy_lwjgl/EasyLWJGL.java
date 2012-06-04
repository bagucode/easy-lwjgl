package easy_lwjgl;

import org.lwjgl.Sys;
import se.softhouse.garden.javanativeloader.NativeLoader;

import java.util.ArrayList;
import java.util.Collection;

public final class EasyLWJGL {

    static {
        final Collection<NativeLoader.LibraryLoadInfo> loadInfos = new ArrayList<NativeLoader.LibraryLoadInfo>();

        // Windows

        // 386
        loadInfos.add(new NativeLoader.LibraryLoadInfo("jinput-dx8.dll", NativeLoader.System.Windows, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("jinput-raw.dll", NativeLoader.System.Windows, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("jinput-wintab.dll", NativeLoader.System.Windows, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("OpenAL32.dll", NativeLoader.System.Windows, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("lwjgl.dll", NativeLoader.System.Windows, NativeLoader.Arch.i386));

        // x64
        loadInfos.add(new NativeLoader.LibraryLoadInfo("jinput-dx8_64.dll", NativeLoader.System.Windows, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("jinput-raw_64.dll", NativeLoader.System.Windows, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("OpenAL64.dll", NativeLoader.System.Windows, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("lwjgl64.dll", NativeLoader.System.Windows, NativeLoader.Arch.x64));

        // Linux

        // 386
        loadInfos.add(new NativeLoader.LibraryLoadInfo("libjinput-linux.so", NativeLoader.System.Linux, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("liblwjgl.so", NativeLoader.System.Linux, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("libopenal.so", NativeLoader.System.Linux, NativeLoader.Arch.i386));

        // x64
        loadInfos.add(new NativeLoader.LibraryLoadInfo("libjinput-linux64.so", NativeLoader.System.Linux, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("liblwjgl64.so", NativeLoader.System.Linux, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("libopenal64.so", NativeLoader.System.Linux, NativeLoader.Arch.x64));

        // Mac OS X
        loadInfos.add(new NativeLoader.LibraryLoadInfo("libjinput-osx.jnilib", NativeLoader.System.MacOSX, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("libjinput-osx.jnilib", NativeLoader.System.MacOSX, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("liblwjgl.jnilib", NativeLoader.System.MacOSX, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("liblwjgl.jnilib", NativeLoader.System.MacOSX, NativeLoader.Arch.x64));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("openal.dylib", NativeLoader.System.MacOSX, NativeLoader.Arch.i386));
        loadInfos.add(new NativeLoader.LibraryLoadInfo("openal.dylib", NativeLoader.System.MacOSX, NativeLoader.Arch.x64));

        final String tmpLibPath = NativeLoader.extractLibraries(loadInfos);
        System.setProperty("org.lwjgl.librarypath", tmpLibPath);

        // Touch the LWJGL Sys class to make it load the libraries
        Sys.initialize();
    }

    public static void load() {
    }
}
