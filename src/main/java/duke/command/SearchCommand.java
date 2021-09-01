package duke.command;

import duke.TaskList;
import duke.Ui;

/**
 * Command class to hand search instruction from user.
 */
public class SearchCommand extends Command {
    private TaskList taskList;
    private String s;

    /**
     * Creates a new SearchCommand
     *
     * @param taskList takes in a list of tasks
     * @param s instruction for searching
     */
    public SearchCommand(TaskList taskList, String s) {
        this.taskList = taskList;
        this.s = s;
    }

    /**
     * Starts searching in all tasks.
     */
    @Override
    public void execute() {
        if (s.length() > 5 && s.split(" ").length >= 2) {
            TaskList.search(s.substring(5));
        } else {
            Ui.myPrint("☹ OOPS!!! Please enter a valid keyword, such as find book");
        }

    }
}
