package com.javarush.task.task31.task3110.command;

import com.javarush.task.task31.task3110.ConsoleHelper;
import com.javarush.task.task31.task3110.ZipFileManager;
import com.javarush.task.task31.task3110.exception.PathIsNotFoundException;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ZipRemoveCommand extends ZipCommand {
    @Override
    public void execute() throws Exception {
            ConsoleHelper.writeMessage("Удаление файла из архива");

            ZipFileManager zipFileManager = getZipFileManager();

            ConsoleHelper.writeMessage("Введите имя файла для удаления:");
            Path pathToDelete = Paths.get(ConsoleHelper.readString());
            zipFileManager.removeFile(pathToDelete);

            ConsoleHelper.writeMessage("Файл был удален из архива.");
    }
}
